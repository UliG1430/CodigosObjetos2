package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SimpleJsonAdapter extends VoorheesExporter {
	
	private JSONObject asignar(Socio socio1) {
		JSONObject obj1=new JSONObject();
		obj1.put("nombre", socio1.getNombre());
		obj1.put("email", socio1.getEmail());
		obj1.put("legajo",socio1.getLegajo());
	return obj1;
	}
	
	private JSONArray pasarALista(List<Socio> socios) {
		JSONArray listajson=new JSONArray();
		for  (	Socio socio1: socios){
			 listajson.add(asignar(socio1));
		}
		return listajson;
	}
	
	public String exportar(List<Socio>socios) {
		return pasarALista(socios).toJSONString();
	}
	
	}



