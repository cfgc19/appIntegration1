package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import generated.Project;

public class unmarshall {
	
public static void main(String[] args) {

	Unmarshaller jaxbUnmarshaller;
	try {
		File file = new File("D:\\Filipa\\OneDrive - Universidade de Coimbra\\4�ano\\IS\\Projeto_1\\src\\series.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Project.class);

		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Project project = (Project) jaxbUnmarshaller.unmarshal(file);
		//System.out.println(project.getMetricData().get(0).getDirection());
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}