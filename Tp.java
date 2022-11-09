class Main
{
        public static void main(String args[])
	{

	int a = Integer.parseInt(args[0]); 
	int b = Integer.parseInt(args[1]);
	int c = 0;
	
		System.out.println("First no. is: "+args[0]); 
		System.out.println("Second no. is: "+args[1]);

	c=a-b;

	System.out.println("substraction of two no. is: "+c); 
	}

}




cd C:\exams
javac Main.java
java Main "%Num1%" "%Num2%" 

	
	
	
	
	
	
For python proj	
Print("Hello World")

C:
cd C:\exam
python B.py	






Maven
clean compile package
https://github.com/Reevegon/maven-helloworld.git


Ant
clean compile test package war
https://github.com/Reevegon/rps-ant.git




ques8 pipeline script 
pipeline {
agent any
parameters {
string(name: 'PERSON' , defaultValue: 'Chrissy', description: 'say hello')
choice(name: 'CHOICE' , choices: ['1','2','3','4'], description: 'pick')
password(name: 'PASSWORD' , defaultValue: '1234', description: 'enter pass')
}
stages {
stage('name') {
steps {
echo "Hello ${params.PERSON}"
}
}
stage('choice') {
steps {
echo "Choice ${params.CHOICE}"
}
}
stage('password') {
steps {
echo "Password: ${params.PASSWORD}"
}
}
}
}



Ques 9 pipeline
https://github.com/be11o/jenkins-pipeline-tutorial.git

