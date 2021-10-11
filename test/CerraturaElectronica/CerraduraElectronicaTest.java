package CerraturaElectronica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraElectronicaTest {

	@Test
	public void AlcrearLaCerraduraElectronicaEstaAbierta() {
		CerraduraElectronica cerradura = new CerraduraElectronica();
		assertTrue(cerradura.estaAbierta());

	}
	@Test
	public void AlCerrarConCodigoLaCajaDebeEstarCerrada() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar (1234);
		asseterTrue (caja.estaCerrada);
			
	}
	private void asseterTrue(Object estaCerrada) {
		// TODO Auto-generated method stub
		
	}


}
