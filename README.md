
Welcome to core.
===================


Hello. Your viewing the github page for **Core**. A bukkit plugin developed and maintained by Nick[zbk] and Nick[vx8]

----------


Adding modules
-------------

Adding a module should be fairly easy. Create a new class. Make what you want.
But. To make things a little bit more tidy

Example, when adding commands put this at the top of your file:

````Java
Core plugin;
	public Spawn(Core passedPlugin){
		this.plugin = passedPlugin;
	}
````

