package Partie2Jauge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JaugeTest{

	public static IJauge creerJauge(long min, long max) {
		return new JaugeDistance(min, max);
	}
	public static IJauge creerJauge(long min, long max, long val) {
		if (min<0||max<0||val<0)
			return new JaugeNegatif(min, max, val);
		else
			return new JaugeNaturel(min, max, val);
	}
	public static IJauge creerJauge(float min,float max,float val) {
		return new JaugeReel(min, max, val);
	}
	
	
	
	IJauge jauge, jauge1, jauge2, jauge3, jauge4, jauge5, jaugeBis, jauge6, jauge7, jauge8;
	
	@Before
	public void initialiser() throws Exception{
		jauge = creerJauge(1.0f, 10.0f, 5.0f);
		jauge1 = creerJauge(1, 10);
		jauge2 = creerJauge(1, 10, 5);
		jauge3 = creerJauge(1, 5, 10);
		jauge4 = creerJauge(100,100,100);
		//jaugeBis = creerJauge(-100, -200, 100);
		//jauge5 = creerJauge(100, 200, 150);
		//jauge6 = creerJauge(100, 200, 301);
		//jauge7 = creerJauge(0,300,321);
		//jauge8 = creerJauge(300,302, 301);
	}
	
	@After
	public void nettoyer() throws Exception{
		jauge = null;
		jauge1 = null;
		jauge2 = null;
		jauge3 = null;
		jauge4 = null;
		//jauge5 = null;
		//jauge6 = null;
		//jauge7 = null;
		//jauge8 = null;
		//jaugeBis = null;
		
	}
	private void testExceptionControlee () throws ClassNotFoundException {
		//throw new ClassNotFoundException();
	}

	@Test
	public void testCreationNonValide() {
		boolean catched = false;
		IJauge inverse = null;
		try {
			inverse  = creerJauge ( 78 , 13 , 0 );
		} catch (IllegalArgumentException e) {
			assert(inverse.getMin()== new Placeholder(0, 0.0f, 78)):"La min ne sont pas les memes!";
			assert(inverse.getMax()== new Placeholder(0, 0.0f, 13)):"La max ne sont pas les memes!";
			assert(inverse.getVal()== new Placeholder(0, 0.0f, 0)):"La val ne sont pas les memes!";
			catched = true;
		}
		if(!catched)
			assert false: "sans exception :(";
		catched = false;
		try {
			IJauge egale = creerJauge(-45 , -45, -45);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		if(!catched)
			assert false: "sans exception :(";
		
		
	}
	@Test
	public void testEstRouge() {
		assert(jauge.estRouge());
		assert(jauge2.estRouge());
		assert(jauge3.estRouge());
		assert(jauge1.estRouge());
	}

	@Test
	public void testEstVert() {
		assert(jauge.estVert()):"jauge est pas vert";
		assert(jauge4.estVert());
	}

	@Test
	public void testEstBleu() {
		assert(jauge1.estBleu());
		assert(jauge4.estBleu());
	}

	@Test
	public void testIncrementer() {
		//assert(jauge.incrementer().equals(jaugeBis));
		Placeholder valeur_avant = jauge.getVal();
		jauge.incrementer();
		assert(jauge.getVal().compareTo(valeur_avant) == 1);
	}

	@Test
	public void testDecrementer() {
		Placeholder valeur_avant = jauge.getVal();
		jauge.decrementer();
		assert(jauge.getVal().compareTo(valeur_avant) == -1):"Valeur n'a pas été décrementée!!!fuckkkk";
	}
	
	@Test
	public void testDansIntervalle() {
		assert(!jauge4.estBleu() && jauge4.estVert() && !jauge4.estRouge()):"La valeur n'est pas dans l'intervalle";
		assert(!jauge5.estBleu() && jauge5.estVert() && !jauge5.estRouge()):"La valeur n'est pas dans l'intervalle";
	}
	@Test
	public void run() {
			     try {
					testExceptionControlee();
				 } catch (ClassNotFoundException e) {
					System.out.println("zoz");
				 }
			     System.out.print("Test de JaugeNaturel:");
			     System.out.print(".");
			     testDansIntervalle();
			      System.out.print(".");
			      testInferieurIntervalle();
			     System.out.println("OK");

	}
	@Test
	public void testDeplacement() {
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
		jauge6.decrementer();
		jauge6.decrementer();
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
		jauge6.incrementer();
		jauge6.incrementer();
		assert(!jauge6.estBleu() && jauge6.estVert() && !jauge6.estRouge()):"La valeur n'est pas dans l'intervalle";
	}
	@Test
	public void testSuperieurIntervalle() {
		assert(!jauge.estBleu() && jauge.estRouge() && !jauge.estVert()):"la valeur de départ est supérieure à l'intervalle :( !";	
	}
	@Test
	public void testInferieurIntervalle() {
		assert(!jauge.estBleu() && !jauge.estRouge() && jauge.estVert()):"la val de depart est trop petite!";	
	}	
}
