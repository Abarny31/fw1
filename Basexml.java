package org.myself;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class Basexml  {
public static void main(String a[]) throws JAXBException{
  JAXBContext context=JAXBContext.newInstance(Data.class);
  Unmarshaller um = context.createUnmarshaller();
  Data d=(Data)um.unmarshal(new File("C:\\Users\\admin\\eclipse-workspaceo\\org.myself\\excel\\data.xml"));
  System.out.println(d.getFname());
  System.out.println(d.getLname());
  System.out.println(d.getAddress());
  System.out.println(d.getEmail());
  System.out.println(d.getGender());
  
}
}
