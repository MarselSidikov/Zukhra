public class Main {

    public static void main(String[] args) {
	    Nokia3310 nokia = new Nokia3310();
	    IPhone iPhone = new IPhone();

	    Cover<Nokia3310> cover = new Cover<>();
	    cover.setPhone(nokia);
//		cover.setPhone(iPhone);

//	    IPhone iPhoneFromCover = cover.getPhone();
//	    iPhoneFromCover.createPhoto();

		Nokia3310 nokiaFromCover = cover.getPhone();
		nokiaFromCover.call();

    }
}
