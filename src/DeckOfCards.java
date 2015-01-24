//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.util.Arrays;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PatternColor;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.internal.PdfA1Checker;
//
//
//public class DeckOfCards {
//
//	public static void main(String[] args) throws DocumentException, FileNotFoundException {
//		Document document = new Document();
//
//        PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
//        
//		String [] cards =	{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
//				String [] sighn = {"\u2665", "\u2666", "\u2660", "\u2663"};
//	
//			  	for (int i = 0; i < cards.length; i++) {
//			for (int j = 0; j < sighn.length; j++) {
//				System.out.printf((cards[i]+sighn[j]+" "));
//				String bufer = (bufer + (cards[i]+sighn[j]+" "));
//				
//				}
//			
//		} 
//			  	System.out.println(bufer);
//
//
//            document.open();
//            document.add(new Paragraph(bufer));
//           
//         document.close(); // no need to close PDFwriter?
//
////        } catch (DocumentException g) {
////          g.printStackTrace();
////        } catch (FileNotFoundException g) {
////            g.printStackTrace();
////        }
//			
//		
//		
//		
//	//	Document document = new Document();
//	//	PdfWriter.getInstance(document, new OutputStream("DeckOfCards") {
//			
//			
//				
//			}
//
//	}
//
//
