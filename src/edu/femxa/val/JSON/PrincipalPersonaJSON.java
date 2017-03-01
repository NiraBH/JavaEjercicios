package edu.femxa.val.JSON;

import com.google.gson.Gson;

public class PrincipalPersonaJSON {

	public static void main(String[] args) {

		Gson gson = new Gson();
		Persona persona = new Persona("Michael", false, false, 4);

		String json_persona = gson.toJson(persona);

		System.out.println(json_persona);

		Persona p2 = gson.fromJson(json_persona, Persona.class);

		System.out.print(p2.getNhijos() + " " + p2.getNombre() + " " + p2.isCasada() + " " + p2.isParado());

	}

}
