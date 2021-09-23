package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {

		try {
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Generated");
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array out of bounds generated");
		}catch(NumberFormatException e) {
				System.out.println("Number format generated");
		}catch (RuntimeException e) {
			System.out.println("Un checked Exception");
		}catch(Exception e) {
			System.out.println(" Checked Exception");
		}
		System.out.println("Normal Statement");
	}

}
