package br.com.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TrabalhandoComDatas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate meuNiver = LocalDate.of(2020,Month.MAY,3).plusYears(1);
		System.out.println((12 -  hoje.getMonthValue()) + meuNiver.getMonthValue() );
		
		Period periodo = Period.between(hoje, meuNiver);
		
		System.out.println(periodo.getDays());
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = hoje.format(formatador);
		
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
	}
	
}
