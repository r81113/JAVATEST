package inherit.player;

import java.io.IOException;
import java.util.Properties;

public class Goplayer {

	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Photographer 陳冠希 = new Photographer();
		
//		Warmup MichaelJordan = new Warmup("Michael Jordan");

		Dunk VinceCarter = new Dunk("Vince Carter");

		Threepoint StephenCurry = new Threepoint("Stephen Curry");

//		陳冠希.film(MichaelJordan);

		陳冠希.film(VinceCarter);

		陳冠希.film(StephenCurry);

		// 1.模擬程序升級,加上籃板球員,實體化
		Rebound DennisRodman = new Rebound("Dennis Rodman");

		陳冠希.film(DennisRodman);

		// 2.要求main方法中不修改,實現某球員升級
		// 解決方案 使用反射+多態
		Properties prop = new Properties();// JAVA配置文件
		// 讀取
		prop.load(Goplayer.class.getResourceAsStream("WarmupConfig.properties"));

		// 通過反射實體化配置文件中的CLASS!!!!!!!!!!!!!!!!!!!
		Warmup warmup = (Warmup) Class.forName(prop.getProperty("rebound")).newInstance();
		Warmup warmup2 = (Warmup) Class.forName(prop.getProperty("rebound2")).newInstance();
		Warmup warmup3 = (Warmup) Class.forName(prop.getProperty("dunk")).newInstance();

		warmup.setName("Rudy Gobert");
		warmup2.setName("Andre Drummond");
		warmup3.setName("Kobe Bryant");

		陳冠希.film(warmup);
		陳冠希.film(warmup2);
		陳冠希.film(warmup3);

	}

}
