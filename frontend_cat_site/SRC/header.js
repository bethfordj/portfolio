import "./styles.css";

/* Images are in a single line to remove space between them (margin 0 and padding zero did not take care of vertical line between them) */

document.getElementById("header").innerHTML = `
<header>
  <div class="header-image-collage">
		<div class="image-row1">
			<img id="header-images" src="/src/IMG/header/gold-matching-eyes.jpg" alt="long hair sandy tabby gold eyes"><img id="header-images" src="/src/IMG/header/gray-white-green-eyes.jpg" alt="gray white cat green eyes"><img id="header-images" src="/src/IMG/header/white-gray-kitten.jpg" alt="white gray kitten on blanket"><img id="header-images" src="/src/IMG/header/black-cat.jpg" alt="fluffy black cat"><img id="header-images" src="/src/IMG/header/tabby-green-eyes.jpg" alt="tabby cat green eyes"><img id="header-images" src="/src/IMG/header/gold-matching-eyes.jpg" alt="long hair sandy tabby gold eyes">
		</div>
   		 <div class="image-row2">
			<img id="header-images" src="/src/IMG/header/gray-tiger-blue-eyes.png" alt="gray tiger cat blue eyes"><img id="header-images" src="/src/IMG/header/black-cat-green-eyes.jpg" alt="lounging black cat green eyes short hair"><img id="header-images" src="/src/IMG/header/orange-tabico.jpg" alt="vivid orange tabico"><img id="header-images" src="/src/IMG/header/grey-blue-eyes.jpg" alt="frost gray long hair cat blue eyes"><img id="header-images" src="/src/IMG/header/calico.jpg" alt="calico with green eyes"><img id="header-images" src="/src/IMG/header/gray-tiger-blue-eyes.png" alt="gray tiger cat blue eyes">
		</div>
		<div class="transparent-layer"></div>
	</div>
  	<nav>
   		<a id="nav-link" href="/menu">MENU</a>
    	<a id="nav-link" href="/cats">CATS</a>
    	<a id="nav-link" href="/about-us">ABOUT US</a>
			<a id="nav-link" href="/contact-us">CONTACT</a>
  	</nav>
	</header>`;
