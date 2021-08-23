import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math.*;


public class Timer{


public static int test=0;
	public static void main(String[] args) throws InterruptedException{


		int work 	=	50;
		int breake 	= 	10;
		int sizebreak 	= 	150;
		int sizework = 30;
		int help = 0;

		boolean sb = false;
		boolean sw = false;

		
		for(int i=0; i < args.length;i++){
			if(args[i].equals("--help")){
				System.out.println(
				"\n\nThis is a programm to track your progress of your promodo work technique in your command line.\nCoded only in nano.\nPresented by: SL-BADCODER\n\n");
				System.out.println(
				"	-w <time>: for how much time you want to work.\n");
				System.out.println(
				"	-b <time>: for how much time you want to break.\n");
				System.out.println(
				"	-sb <size>: for how much time you want to break every minute needs 3 size (for example: -b 5 -sb 15).\n");
				System.out.println(
				"	-sw <size>: same as size for break (-sb) (look above).\n");
				System.out.println(
				"	-t: if you want to test your inputs (directly been printed without waiting).\n");
				System.out.println(
				"	-h: for this output.\n");
				help = 1;
			}
			else if(args[i].equals("-w")){
				work = Integer.parseInt(args[++i]);
			}
			else if(args[i].equals("-b")){
				breake = Integer.parseInt(args[++i]);

			}
			else if(args[i].equals("-sb")){
				sizebreak = Integer.parseInt(args[++i]);
				sb = true;
			}else if(args[i].equals("-t")){
				test =1;
			}else if(args[i].equals("-sw")){
				sizework = Integer.parseInt(args[++i]);
				sw = true;
			}

		}
		if(help == 0){
		if(!sw){
		sizework = 3*work;
		}if(!sb){
		sizebreak = 3*breake;
		}
	//	sizework = 3*work;
	//	sizebreak = 3*work;
		timer(work,breake,sizebreak,sizework);}

	}

	public static void timer(int work,int breake,int sizebreak,int sizework) throws InterruptedException{

	int length = 60*work/sizework;
	int rep = 60*work/length;
	int stretchw = sizework/(3*work);
		for(int i=1; i <= rep; i++){
			double x = i;
			x = 1.0/3.0 *x;
			x *= 10;
			x = Math.round(x);
			x /= 10;
			double w = work*stretchw;
			double percent = (x/w) *1000;
			x /= stretchw;
			x *= 10;
			x = Math.round(x);
			x /= 10;
			percent = Math.round(percent);
			percent /= 10;
			System.out.print("Work Progress::  " + percent+"% " + (" ").repeat(5 - (String.valueOf(percent).length())) +"[" + ("#").repeat(i) + ("-").repeat(rep - i)+"]    ( " + x +"min / " +work +"min )"+  "\r");
			if(test == 0){
			TimeUnit.SECONDS.sleep(length);
		}}
		System.out.println();

		length = 60*breake/sizebreak;
		rep = 60*breake/length;
		int stretchb = sizebreak/(3*breake);
		for(int i=1; i <= rep; i++){
			double x = i;
			x = 1.0/3.0 *x;
			x *= 10;
			x = Math.round(x);
			x /= 10;
			double w = breake*stretchb;
			double percent = (x/w) *1000;
			x /=stretchb;
			x *= 10;
			x = Math.round(x);
			x /= 10;
			percent = Math.round(percent);
			percent /= 10;
			System.out.print("Break Progress:: " + percent+"% " + (" ").repeat(5 - (String.valueOf(percent).length())) +"[" + ("#").repeat(i) + ("-").repeat(rep - i)+"]    ( " + x +"min / " +breake +"min )"+  "\r");
			if(test == 0){
			TimeUnit.SECONDS.sleep(length);
			}
		}
		System.out.println();
	}

}

