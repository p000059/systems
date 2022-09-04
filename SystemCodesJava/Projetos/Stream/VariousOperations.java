package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class VariousOperations {

	public void showListForeachStream(List<Integer> A) {

		System.out.println("\nThird Example\n");

		A.stream().forEach(e -> System.out.print("[" + e + "] "));

		System.out.println();
	}

	public List<Integer> skipTwoItemFirst(List<Integer> A, Integer skipElement) {

		List<Integer> B = new ArrayList<>();

		try {
			B = A.stream().skip(skipElement) // Pula os elementos da lista de acordo com a variável passada skipElement.
					.collect(Collectors.toList()); // Create and return new list with new values.
		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public List<Integer> limitsToTheFirstElements(List<Integer> A, Integer limitElement) {

		List<Integer> B = new ArrayList<>();

		try {
			B = A.stream().limit(limitElement) // Estipula o limite de retorno somente para os primeios itens da lista,
												// o restante não será impresso.
					.collect(Collectors.toList()); // Create and return new list with new values.
		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public List<Integer> returnEvenNumbers(List<Integer> A) {

		List<Integer> B = new ArrayList<>();

		try {
			B = A.stream().filter(e -> e % 2 == 0) // Esse filtro define o retorno somente de números pares.
					.collect(Collectors.toList()); // Create and return new list with new values.
		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public List<Integer> distinctElements(List<Integer> A) {

		List<Integer> B = new ArrayList<>();

		try {
			B = A.stream().distinct() // Strip repeated numbers.
					.collect(Collectors.toList()); // Create and return new list with new values.

		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public List<Integer> skipAndLimitElement(List<Integer> A, Integer skipElement, Integer limitElement) {

		List<Integer> B = new ArrayList<>();

		try {
			A.stream().skip(skipElement) // Pula o número de elementos recebidos de acordo com a variável skipElement.
					.limit(limitElement) // Permite somente o retorno de elementos de acordo com a quantidade passada
											// pela variável limitElement.
					.collect(Collectors.toList()); // Create and return new list with new values.
		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public List<Integer> tenthExample(List<Integer> A, Integer element) {

		List<Integer> B = new ArrayList<>();

		try {
			B = A.stream().map(e -> e * element) // Transforma o valor multiplicando pelo elemento recebido.
					.collect(Collectors.toList()); // Create and return new list with new values.
		} catch (Exception e) {
			e.getMessage();
		}

		return B;
	}

	public Long countElements(List<Integer> A) {

		Long cnt = null;

		try {

			cnt = A.stream().count(); // Faz a soma total dos elementos de uma lista e retorna um valor somando destes
										// elementos.

		} catch (Exception e) {
			e.getMessage();
		}

		return cnt;
	}

	public Optional<Integer> compareMinimumValue(List<Integer> A) {

		try {

			Optional<Integer> min = A.stream().min(Comparator.naturalOrder()); 

			return min;
			
		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public Optional<Integer> compareMinimumAndMaximumValue(List<Integer> A) {

		try {

			Optional<Integer> max = A.stream().max(Comparator.naturalOrder());

			return max;

		} catch (Exception e) {

			return Optional.empty();
		}
	}

	public void GroupEvenAndOdd(List<Integer> A) {
		
		Map<Boolean, List<Integer>> mmap = A.stream().collect(Collectors.groupingBy(e -> e % 2 == 0));
		
		System.out.println("New list " + mmap + " ");
	}

	public String convertIntToString(List<Integer> A) {
		// o método joining da classe Collectors só serve para ser utilizado com
		// Strings.
		// O map vai transformar os valores a lista de inteiros "A" em string.
		// A classe Collectors vai unir os valores encontrados em "A" na string "str".

		String str = "";

		try {

			str = A.stream().map(e -> String.valueOf(e)).collect(Collectors.joining());

		} catch (Exception e) {
			
			return e.getMessage();
		}

		return str;
	}

	public List<Integer> returnOrderedNumbers(List<Integer> listNumber) {

		List<Integer> listOrderedNumbers = new ArrayList<>();

		try {

			listOrderedNumbers = listNumber.stream()
					.sorted() // Ordered numbers.
					.collect(Collectors.toList()); // Create and return new list with new values.

		} catch (Exception e) {
			
			e.getMessage();
		}

		return listOrderedNumbers;
	}

	public Integer returnsReduceValue(List<Integer> A) {
		
		// Esse valor de identidade do reduce, "0", é utilizado para soma.
		// Se o stream() estiver vazio, ele vai receber o valor de identidade.
		
		try {

			return A.stream().reduce(0, (integer, integer2) -> integer + integer2);
			
		} catch (NullPointerException e) {
			
			return Integer.valueOf(null);
			
		} catch (Exception e) {
			
			return Integer.valueOf(1);
		}
	}

	public Integer valueIdentityMultiplication(List<Integer> A) {
		
		// Esse valor de identidade do redude, "1", é utilizado para multiplicação.
		// Se o stream() estiver vazio, ele vai receber o valor de identidade.
		
		try {

			return A.stream().reduce(1, (n1, n2) -> n1 * n2);
			
		} catch (Exception e) {
			
			return Integer.valueOf(0);
			
		}
	}

	public String valueIdentityString(List<String> A) {
		
		// O valor de identidade para string será " ".
		// Se o stream() estiver vazio, ele vai receber o valor de identidade.
		
		try {

			return A.stream().reduce(" ", (s1, s2) -> s1.concat(s2));
			
		} catch (Exception e) {
			
			return String.valueOf(e);
			
		}
	}

	public double valueIdentityDouble(List<Double> A) {
		
		// O valor de identidade é um positivo infinito
		
		try {

			return A.stream().reduce(Double.POSITIVE_INFINITY, (n1, n2) -> Math.min(n1, n2));
			
		} catch (Exception e) {

			return double.class.getModifiers();
		}
	}

	public String valueIdentityReduce(List<String> A) {
		
		try {
			
			return A.stream().reduce("", (n1, n2) -> n1.toString().concat(n2.toString()), (n1, n2) -> n1.concat(n2));
			
		} catch (Exception e) {
			
			return String.valueOf(e);
			
		}
	}
	
	 public List<Integer> useDistinction(List<Integer> A){
	        
	        List<Integer> B = A.stream()
	                .distinct() // Filtra por resultados repeditos.
	                .collect(Collectors.toList());
	        return B;
	        
	    }

	    public void skipFirstElements(List<Integer> A){
	        
	        A.stream()
	            .skip(2) // O número 2 passado como parâmetro estipula o salto pelos dois primeiros elementos da lista.
	            .collect(Collectors.toList());
	        
	    }

	    public void returnStartOfList(List<Integer> A){
	        
	        A.stream()
	            .limit(2) // Estipula o limite de retorno somente para os dois primeios itens da lista, o restante não será impresso.
	            .forEach(e -> System.out.print("[" + e + "] "));
	        
	    }

	    public List<Integer> sixthExample(List<Integer> A){
	        
	        List<Integer> B = A.stream()
	            .filter(e -> e % 2 == 0) // Esse filtro define o retorno somente de números pares.
	            .collect(Collectors.toList()); //Adiciona o filtro para uma nova lista e retorna a nova lista.
	        
	        return B;
	    }

	    public void seventhExample(List<Integer> A){
	        
	        A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista, ele usa a comparação do equals() e hashcode().
	            .forEach(e -> System.out.print("[" + e + "] "));
	        
	    }

	    public void eighthExample(List<Integer> A){
	        
	        A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista.
	            .skip(2) // O número 2 passado como parâmetro estipula o salto pelos dois primeiros elementos da lista.
	            .limit(10) // Permite somente o retorno de 10 elementos.
	            .filter(e -> e % 2 == 0) // Retorna somente números pares.
	            .forEach(e -> System.out.print("[" + e + "] "));
	        
	    }

	    public void ninthExample(List<Integer> A){
	        
	        A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da impressão.
	            .skip(2) // O número 2 passado como parâmetro estipula o salto pelos dois primeiros elementos da lista.
	            .limit(10) // Permite somente o retorno de 10 elementos.
	            .filter(e -> e % 2 == 0) // Retorna somente números pares.
	            .forEach(e -> System.out.print("[" + e + "] "));
	        
	    }

	    public void tenthExample(List<Integer> A){
	        
	        //Neste exemplo foi melhor fazer a distinção e o filtro antes de executar a mudança de valores.
	        A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista.
	            .filter(e -> e % 2 == 0) // Retorna somente números pares.
	            .map(e -> e * 2) // Transforma o valor do dado
	            .forEach(e -> System.out.print("[" + e + "] "));
	        
	    }

	    public long eleventhExample(List<Integer> A){
	        
	        long cnt = A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista.
	            .filter(e -> e % 2 == 0) // Retorna somente os valores pares
	            .count();
	        
	        return cnt;
	    }

	    public Optional<Integer> twelveExample(List<Integer> A){
	        
	        //Neste exemplo foi melhor fazer a distinção antes de executar a mudança de valores.
	        Optional<Integer> numberASC = A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista.
	            .min(Comparator.naturalOrder()); //Faz uma comparação do menor elemento da lista para assim executar a ordenação crescente.
	        
	        return numberASC;
	    }

	    public Optional<Integer> thirteenthExample(List<Integer> A){
	        
	        //Neste exemplo foi melhor fazer a distinção antes de executar a mudança de valores.
	        Optional<Integer> numberDESC = A.stream()
	            .distinct() // Não permite que elementos repetidos apareçam no retorno da lista.
	            .max(Comparator.naturalOrder()); //Faz uma comparação do maior elemento da lista para assim executar a ordenação decrescente.
	        
	        return numberDESC;
	    }

	    public List<Integer> fourteenthExample(List<Integer> A){
	        
	        //Neste exemplo é utilizado a operação(método) intermediária .map() que vai alterar o resultado das operações anteriores.
	        List<Integer> B = A.stream()
	            .distinct() //Não permite a repetição de números.
	            .filter(e -> e % 2 == 0) //Filtra os resultados em somente números pares.
	            .map(e -> e * 2) //multiplica os valores pares da operação intermediária anterior.
	            .collect(Collectors.toList()); //Coleta os resultados das operações intermediárias do stream e adiciona em uma nova lista "B".
	        
	        return B;
	    }
	    
	    public List<Integer> fourteenthExampleReturn01(List<Integer> A){ 
	        
	        //Este método retorna uma lista do tipo integer depois de executada com as operações que seguem.
	        List<Integer> B = A.stream()
	            .filter(n -> n % 2 == 1) //Filtro que vai definir o retorno de somente números impares.
	            .map(e -> e * 1) //Esse método vai multiplicar os números impares por 1, o que não vai alterar o resultado.
	            .collect(Collectors.toList()); //Coleta os resultados e adiciona-os para a nova lista B;
	        return B;
	    }
	    
	    public List<Integer> fourteenthExampleReturn02(List<Integer> A){
	        return A.stream() // Nesse método, o retorno não necessita de uma nova lista, ele retorna o resultado da operação diretamente ao tipo do método.
	            .filter(n -> n % 2 == 1) //Filtro que vai definir o retorno de somente números impares.
	            .map(e -> e * 1) //Esse método vai multiplicar os números impares por 1, o que não vai alterar o resultado.
	            .collect(Collectors.toList()); //Coleta os resultados e adiciona-os para a nova lista B;
	    }

	    public void fifteenthExample(List<Integer> A){
	        Map<Boolean, List<Integer>> mmap = A.stream()
	                .distinct() //Não permite a repetição de números.
	                .collect(Collectors.groupingBy(e -> e % 2 == 0));//Agrupa(coleta) o resultado da expressão que é verdadeira em par e falso em impar.
	        System.out.println("New list " + mmap + " ");
	    }

	    public void sixteenthExample(List<Integer> A){
	        Map<Integer, List<Integer>> mmap = A.stream()
	                .distinct() //Não permite a repetição de números.
	                .collect(Collectors.groupingBy(e -> e % 3));
	        System.out.println(mmap);
	    }

	    public void seventeenthExample(List<Integer> A){
	        String str = A.stream()
	                //.distinct() //Não permite a repetição de valores.
	                .map(e -> String.valueOf(e)) // O map vai transformar os valores a lista de inteiros "A" em string.
	                .collect(Collectors.joining(";")); // A classe Collectors vai unir os valores encontrados em "A" na string "str".
	                // o método joining da classe Collectors só serve para ser utilizado com Strings.
	        System.out.println(str);
	    }

	    public void eighteenthExample(List<Integer> A){
	        A.stream()
	                .limit(15)
	                .filter(e -> e % 2 == 0)
	                .map(e -> e * 2)
	                .forEach(System.out::println);
	    }

	    public static Optional<Integer> nineteenthReduce(List<Integer> A){
	        try {
	            Optional optional = A.stream()
	                    .distinct()
	                    .filter(e -> e % 2 == 0)
	                    .reduce((n1, n2) -> n1 + n2);
	            return optional;
	        }
	        catch (Exception e){
	            return Optional.empty();
	        }
	    }

	    public static Optional<Integer> eleventhReduce(List<Integer> A){
	        try {
	            Optional optional = A.stream()
	                    .distinct()
	                    .reduce((n1, n2) -> n1 - n2);
	            return optional;
	        }
	        catch (Exception e){
	            return Optional.empty();
	        }
	    }

	    public static Optional<String> tenthReduce(List<String> A){
	        try {
	            return A.stream()
	                    .reduce((s1, s2) -> s1.concat(s2));
	        }
	        catch (IndexOutOfBoundsException e){
	            return Optional.empty();
	        }
	    }

	    public static Integer twelfthReduce(List<Integer> A){
	        //Esse valor de identidade do reduce, "0", é utilizado para soma.
	        try {
	            return A.stream()
	                    .distinct()
	                    .filter(e -> e % 2 == 0)
	                    .reduce(0,(integer, integer2) -> integer + integer2);
	        }
	        catch (NullPointerException e){
	            return Integer.valueOf(null);
	        }
	        catch (Exception e){
	            return Integer.valueOf(1);
	        }
	    }

	    public static Integer thirteenthReduce(List<Integer> A){
	        //Esse valor de identidade do redude, "1", é utilizado para multiplicação.
	        try {
	            return A.stream()
	                    .distinct()
	                    .filter(e -> e % 2 == 0)
	                    .reduce(1,(n1,n2) -> n1 * n2);
	        }
	        catch (Exception e){
	            return Integer.valueOf(0);
	        }
	    }

	    public static String fourthReduce(List<String> A){
	        //O valor de identidade para string será " ".
	        try {
	            return A.stream()
	                    .reduce(" ", (s1, s2) -> s1.concat(s2));
	        }
	        catch (Exception e){
	            return String.valueOf(e);
	        }
	    }

	    public static double fifthReduce(List<Double> A){
	        try {
	            return A.stream()
	                    .reduce(Double.POSITIVE_INFINITY,(n1, n2) -> Math.min(n1, n2));
	        }
	        catch (Exception e){
	            return double.class.getModifiers();
	        }
	    }

	    public static String sixthReduce(List<String> A){
	        try {
	            return A.stream()
	                    .reduce(
	                            "",
	                            (n1, n2) -> n1.toString().concat(n2.toString()),
	                            (n1, n2) -> n1.concat(n2)
	            );
	        }
	        catch (Exception e){
	            return String.valueOf(e);
	        }
	    }
}
