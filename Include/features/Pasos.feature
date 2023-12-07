Feature: Quiero iniciar el formulario y mandarlo

	Scenario: entro al formulario
	Given Abro el navegador y me dirijo a la página
	When Presiono el botón Make Appointment
	And Pongo el nombre la contraseña e inicio sesión
	And Coloco los datos correspondientes
	And Presiono el botón Book Appointment
	And Vuelvo a la página principal
	Then Cierro el navegador