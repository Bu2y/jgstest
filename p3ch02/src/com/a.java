package com;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a {
    Document doc = null;

    //获取DOM树
    public void getDocument() {
        //1.获取DOM解析器工厂对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.获取DOM解析器对象
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            //3.解析xml文档时，得到一个document对象，即加载DOM树
            doc = builder.parse("p3ch02/收藏信息.xml");
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void addInfo(){
        //1.创建新的Brand节点，并设置name属性
        Element newEle = doc.createElement("Brand");
        //设置Brand节点name属性值为三星
        newEle.setAttribute("name", "三星");
        //创建Type节点
        Element newType = doc.createElement("Type");
        //设置type节点name属性值为NoteX
        newType.setAttribute("name", "NoteX");
        //在新的Brand节点中追加新的type子节点
        newEle.appendChild(newType);
        //获取PhoneInfo节点对象
        Element phoneElement = (Element)doc.getElementsByTagName("PhoneInfo").item(0);
        //2.把新的Brand节点加到其父节点上
        phoneElement.appendChild(newEle);
    }


    public void saveInfo(){
        //1.创建转换工厂
        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            //2.创建转换器
            Transformer former = factory.newTransformer();
            DOMSource xmlSource = new DOMSource(doc);
            StreamResult outputTarget = new StreamResult(new FileOutputStream("p3ch02/新的收藏信息.xml"));
            //3.设置编码类型
            former.setOutputProperty(OutputKeys.ENCODING, "gb2312");
            //4.把DOM树转换为XML文件
            former.transform(xmlSource, outputTarget);
        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    /**
     * 显示XML中所有信息
     */
    public void showInfo() {
        //获取<Brand>的所有节点集合
        NodeList nodeList = doc.getElementsByTagName("Brand");
        for (int i = 0; i < nodeList.getLength(); i++) {
            //获取第i个Brand元素信息
            Node brand = nodeList.item(i);
            //转换为Element节点对象
            Element brandEle = (Element) brand;
            //获取第i个Brand元素的name属性值
            String brandStr = brandEle.getAttribute("name");
            //获取第i个Brand元素的所有子元素的属性值
            NodeList types = brandEle.getChildNodes();
            for (int j = 0; j < types.getLength(); j++) {
                Node type = types.item(j);
                if (type.getNodeType() == Node.ELEMENT_NODE) {
                    ///转换为Element节点对象
                    Element typeEle = (Element) type;
                    //获得手机型号
                    String typeStr = typeEle.getAttribute("name");
                    System.out.println("手机：" + brandStr + typeStr);
                }
            }

        }
    }


    public static void main(String[] args) {
        a a = new a();
        a.getDocument();
        a.addInfo();
        a.saveInfo();
        a.showInfo();
    }
}
