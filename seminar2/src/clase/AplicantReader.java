package clase;

public class AplicantReader implements Reader {
		public void readAplicant(Scanner scanner) {
			String nume = scanner.next();
			String prenume = scanner.next();
			int varsta = scanner.nextInt();
			int punctaj = scanner.nextInt();
			int nr = scanner.nextInt();
			String[] vect = new String[nr];
			for (int i = 0; i < nr; i++)
				vect[i] = scanner.next();
			aplicant.setNume(nume);
			aplicant.setPrenume(prenume);
			aplicant.setVasrta(varsta);
			aplicant.setPunctaj(punctaj);
			aplicant.setNrProiecte(nr);
			aplicant.setDenumireProiecte(nr,vect);
		}
}
