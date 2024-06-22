package blog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;


public class main {

	public static void main(String[] args) {
	    String path = "./src/article";
	    File dir = new File(path);
	    File[] files = dir.listFiles();

	    for (int i = 0; i < files.length; i++) {
//	        File file = files[i];
//	        System.out.println(file);
	    	//宣言時のパスを取得
            String str = files[i].getPath();

            System.out.println((i+1)+"個目のファイル名："+str);

	    	try {
	    		File file = new File(str);

//				FileReader filereader = new FileReader(files[i]);

	    		//txtファイルを1行ごとに読み取り
				BufferedReader reader = new BufferedReader(new FileReader(files[i]));


			      System.out.println("タイトル："+reader.readLine());

			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

 catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}


	    }



	}

}
