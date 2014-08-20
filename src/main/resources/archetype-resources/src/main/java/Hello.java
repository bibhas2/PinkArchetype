#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.inject.Named;

@Named
public class Hello {
	public String index() {
		System.out.println("Saying it with pink.");

		return "greeting";
	}
}
