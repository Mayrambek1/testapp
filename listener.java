import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class listener implements ActionListener{
	inter in;
	String temp;
	String leftNum;
	String rightNum;
	char action;
	listener(inter i){
		in=i;
		temp="";
		String leftNum="";
		String rightNum="";
		action='@';
	}
	
	public void actionPerformed(ActionEvent event){
		String text=event.getActionCommand();
		if(text.equals("1")){
			temp=temp+"1";
			in.field.setText(temp);
		}
		else if(text.equals("2")){
			temp=temp+"2";
			in.field.setText(temp);
		}
		else if(text.equals("+")){
			leftNum=temp;
			temp="";
			action='+';
		}
		else if(text.equals("C")){
		temp="";
		String leftNum="";
		String rightNum="";
		action='@';
		in.field.setText(temp);
		}
		else if(text.equals("1/x")){
			leftNum="1";
			rightNum=temp;
			double firstNum=Double.parseDouble(leftNum);
			double secondNum=Double.parseDouble(rightNum);
			double result=firstNum/secondNum;
			String answer=result+"";
			in.field.setText(answer);
			temp="";
		}
		else if(text.equals("Sqrt")){
			leftNum=temp;
			double firstNum=Double.parseDouble(leftNum);
			double result=Math.sqrt(firstNum);
			String answer=result+"";
			in.field.setText(answer);
			temp="";
		}
		else if(text.equals("=")){
			rightNum=temp;
			double firstNum=Double.parseDouble(leftNum);
			double secondNum=Double.parseDouble(rightNum);
			double result=0;
			switch(action){
				case '+': result=firstNum+secondNum;
				break;
				case '-': result=firstNum-secondNum;
				break;
			}
			String answer=result+"";
			in.field.setText(answer);
		}
	}
}