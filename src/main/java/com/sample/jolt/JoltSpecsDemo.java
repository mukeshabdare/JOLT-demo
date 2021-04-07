/**
 * 
 */
package com.sample.jolt;

import java.util.List;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

/**
 * @author abdare
 *
 */
public class JoltSpecsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

        Object chainrSpecJSON = JsonUtils.classpathToObject("/specs.json");
        
        Chainr chainr = Chainr.fromSpec(chainrSpecJSON);

        Object inputJSON = JsonUtils.classpathToObject("/input.json");
        
        System.out.println(JsonUtils.toPrettyJsonString(inputJSON));

        Object transformedOutput = chainr.transform(inputJSON);
        
        System.out.println(JsonUtils.toPrettyJsonString(transformedOutput));

	}

}
