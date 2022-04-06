package com.simple.questions;

import java.util.List;

public class Question2 {

	private void processarItens(List<Item> itens) {

		for (Item i : itens) {
			try {
				processar(i);

			} catch (ItemException e) {
				e.printStackTrace();
			}
		}
	}

	private void processar(Item i) throws ItemException {
		// implementação do processamento omitido
		// ...
	}

	private class Item {

	}

	private class ItemException extends Exception {

		private static final long serialVersionUID = 1L;

	}

}
