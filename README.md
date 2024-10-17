> [!NOTE]
> At the end of this documentation, there is a tree of src directory of this project. It will help to you to coordinate.

### Adapter Pattern
The Adapter Pattern allows incompatible interfaces to work together. In this case, it enables an audio player, which originally only supports MP3 files, to also play WAV and AAC files without changing the existing player’s structure. By using an adapter, we integrate new formats seamlessly into the system.

### Bridge Pattern
The Bridge Pattern is used to separate the abstraction from its implementation, allowing them to vary independently. Here, it helps create a universal remote that can control different devices, such as TVs or sound systems, from multiple manufacturers. This approach makes it easy to add new devices or remotes without altering existing code.

### Composite Pattern
The Composite Pattern enables treating individual objects and compositions of objects uniformly. In this project, it is applied to a restaurant menu system where a menu can contain both individual menu items and sub-menus. This pattern simplifies the structure and management of complex hierarchical menus.

### Decorator Pattern
The Decorator Pattern provides a flexible way to add behaviors or features to an object dynamically. Here, it is used to allow customers to customize their pizza with various toppings. Each topping is a decorator that wraps the base pizza and adds its own cost and description, making it easy to mix and match different options.

### Facade Pattern
The Facade Pattern simplifies complex systems by providing a unified interface. In the smart home system, a facade class controls multiple smart devices like lights, thermostats, and security systems. Users interact with a simple interface to activate scenarios like "movie mode" or "night mode," while the facade handles the internal device interactions.

### Flyweight Pattern
The Flyweight Pattern minimizes memory usage by sharing as much data as possible. It is especially useful in this text editor system, where a large number of characters need to be rendered. Instead of creating a new object for every character, the pattern reuses existing ones with the same intrinsic properties, significantly improving performance.

### Proxy Pattern
The Proxy Pattern controls access to an object, often deferring the object's full creation until it's needed. In the online learning platform, video lectures are only loaded when a student decides to watch them, saving resources. The proxy stands in for the actual video and ensures efficient loading and playback.

```bash
src
├── README.md
├── adapterPattern
│   ├── AACPlayer.java
│   ├── AdvancedAudioPlayer.java
│   ├── AudioAdapter.java
│   ├── AudioPlayer.java
│   ├── MP3Player.java
│   ├── MusicPlayerApp.java
│   └── WAVPlayer.java
├── bridgePattern
│   ├── AdvancedRemote.java
│   ├── BasicRemote.java
│   ├── DVDDevice.java
│   ├── Device.java
│   ├── HomeEntertainmentSystem.java
│   ├── RemoteControl.java
│   └── TVDevice.java
├── compositePattern
│   ├── Menu.java
│   ├── MenuComponent.java
│   ├── MenuItem.java
│   └── RestaurantApp.java
├── decoratorPattern
│   ├── CheeseTopping.java
│   ├── MargheritaPizza.java
│   ├── PepperoniTopping.java
│   ├── Pizza.java
│   ├── PizzaShop.java
│   └── ToppingDecorator.java
├── facadePattern
│   ├── Light.java
│   ├── SecuritySystem.java
│   ├── SmartHomeApp.java
│   └── SmartHomeFacade.java
├── flyweightPattern
│   ├── Character.java
│   ├── CharacterFactory.java
│   ├── TextEditor.java
│   └── TextEditorApp.java
└── proxyPattern
    ├── LearningPlatformApp.java
    ├── OnlineCourse.java
    ├── ProxyVideoLecture.java
    ├── RealVideoLecture.java
    └── VideoLecture.java
```