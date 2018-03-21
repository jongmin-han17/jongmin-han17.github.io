//By Jongmin Han
//Email: jongmin.han@live.lagcc.cuny.edu
//March 18, 2018
//Extra Credit - PFN evaluation using MyStack

import java.util.Arrays;

public class JavaPostfixProject 
{
	//The method to do PFN evaluation
	public static double postfixEval(String postfixExpr) //
	{
		//Create new MyStack object
		MyStack operandStack = new MyStack();
		
		for (int i=0; i < postfixExpr.length(); i++)
		{
			/*
			If postfixExpr.charAt(i) is a number, then convert it from char to double 
			and push it into operansStack. If it isn't a number, then it is operator.
			Pop two numbers from operandStack then calculate two numbers according to operator.
			Push the result into operandStack.
			*/
			if (Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9').contains(postfixExpr.charAt(i)))
				operandStack.push(Double.parseDouble(Character.toString(postfixExpr.charAt(i))));
			else 
			{
				double operand2 = operandStack.getTop();
				operandStack.pop();
				double operand1 = operandStack.getTop();
				operandStack.pop();
				double result = doMath(postfixExpr.charAt(i), operand1, operand2);
				operandStack.push(result);
			}
		}
		//The last number in operandStack is the final result. Return the result.
		return operandStack.getTop();
	}
	
	//The method to do calculation
	//op is for operator.
	//op1 and op2 are for operands.
	public static double doMath(char op, double op1, double op2)
	{
		if (op == '*')
			return op1 * op2;
		else if (op == '/')
			return op1 / op2;
		else if (op == '+')
			return op1 + op2;
		else
			return op1 - op2;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(postfixEval("34*452-/+"));
		//Prints 13.333333333333334
		System.out.println(postfixEval("43*5+"));
		//Prints 17.0
	}
}
