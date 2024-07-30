package com.exemplo;

public class CoresFormaDecorator extends FormaDecorator {
	
	public CoresFormaDecorator(Forma formaDecorator) {
        super(formaDecorator);
    }

    @Override
    public void desenho() {
    	formaDecorator.desenho();
    	setBordaVermelha(formaDecorator);
    }

    private void setBordaVermelha(Forma formaDecorator) {
        System.out.println("Cor da bordar: Vermelha");
    }

}
