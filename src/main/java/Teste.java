import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Teste {
	
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		final Calendar cal = Calendar.getInstance();
		System.out.println(df.format(cal.getTime()));
	}

}
