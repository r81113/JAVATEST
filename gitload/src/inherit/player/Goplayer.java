package inherit.player;

import java.io.IOException;
import java.util.Properties;

public class Goplayer {

	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Photographer ���a�� = new Photographer();
		
//		Warmup MichaelJordan = new Warmup("Michael Jordan");

		Dunk VinceCarter = new Dunk("Vince Carter");

		Threepoint StephenCurry = new Threepoint("Stephen Curry");

//		���a��.film(MichaelJordan);

		���a��.film(VinceCarter);

		���a��.film(StephenCurry);

		// 1.�����{�Ǥɯ�,�[�W�x�O�y��,�����
		Rebound DennisRodman = new Rebound("Dennis Rodman");

		���a��.film(DennisRodman);

		// 2.�n�Dmain��k�����ק�,��{�Y�y���ɯ�
		// �ѨM��� �ϥΤϮg+�h�A
		Properties prop = new Properties();// JAVA�t�m���
		// Ū��
		prop.load(Goplayer.class.getResourceAsStream("WarmupConfig.properties"));

		// �q�L�Ϯg����ưt�m��󤤪�CLASS!!!!!!!!!!!!!!!!!!!
		Warmup warmup = (Warmup) Class.forName(prop.getProperty("rebound")).newInstance();
		Warmup warmup2 = (Warmup) Class.forName(prop.getProperty("rebound2")).newInstance();
		Warmup warmup3 = (Warmup) Class.forName(prop.getProperty("dunk")).newInstance();

		warmup.setName("Rudy Gobert");
		warmup2.setName("Andre Drummond");
		warmup3.setName("Kobe Bryant");

		���a��.film(warmup);
		���a��.film(warmup2);
		���a��.film(warmup3);

	}

}
