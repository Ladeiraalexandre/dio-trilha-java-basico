package com.exemplo;

public abstract class FormaDecorator implements Forma {
	
	protected Forma formaDecorator;

    public FormaDecorator(Forma formaDecorator) {
        this.formaDecorator = formaDecorator;
    }

    @Override
    public void desenho() {
    	formaDecorator.desenho();
    }

}
