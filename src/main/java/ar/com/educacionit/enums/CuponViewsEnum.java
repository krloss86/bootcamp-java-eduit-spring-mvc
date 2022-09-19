package ar.com.educacionit.enums;

public enum CuponViewsEnum {
	//heroku requiere path sin / al inicio
	LIST("cupon/list"),
	EDIT("cupon/edit"),
	NEW("cupon/new"),
	LIST_REDIRECT("redirect:/cupon/list"),
	;
	
	private String view;
	
	private CuponViewsEnum(String view) {
		this.view = view;			
	}

	public String getView() {
		return view;
	}
	
}
