import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.zamora.Coche;
import com.zamora.MediadorImpl;
import com.zamora.Radio;
import com.zamora.Telefono;

public class TestSistema {

	private Radio radio;
	private Telefono telefono;
	private Coche coche;
	private MediadorImpl mediador;
	
	@Before
	public void init() {
		mediador = new MediadorImpl();
		radio = new Radio(mediador);
		telefono = new Telefono(mediador);
		coche = new Coche(mediador);

		mediador.setRadio(radio);
		mediador.setTelefono(telefono);
		mediador.setCoche(coche);
	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(radio.encendida());
		assertFalse(telefono.musicaEncendida());
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		coche.enciende();
		
		assertTrue(radio.encendida());
		assertFalse(telefono.musicaEncendida());
	
		coche.apaga();
		assertFalse(radio.encendida());
	}

	@Test
	public void test_suena_telefono() {
		radio.enciende();
		assertTrue(radio.encendida());
		
		telefono.recibeLlamada();
		
		assertFalse(radio.encendida());
	}
	
	@Test
	public void test_enciende_radio() {
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		radio.enciende();
		
		assertFalse(telefono.musicaEncendida());
	}
}