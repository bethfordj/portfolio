<template>
  <div class="footer">
    <div class="left-column">
      <div id="logo-and-adopt-url">
        <h1>
          <img class="nav-logo" src="@/assets/img/logo.png">Adoptme.Org
        </h1>
      </div>
      <p>Main St. #1245</p>
      <p>Amazing City, 45677</p>
      <p class="subscript">Some images were taken from unsplash.com</p>
    </div>
    <ul>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'whatWeDo' }" tag="li">
          <p>WHAT we do</p>
        </router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'whoWeAre' }" tag="li">WHO we are</router-link>
      </li>
      <li class="three-top-nav-links">
        <router-link v-bind:to="{ name: 'eventsAdoption' }" tag="li">EVENTS adoption</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "FooterInformation"
};
</script>

<style  lang="scss">
li {
  font-size: 1.3rem;
}

h1 {
  font-size: 1.5rem;
  font-family: $font-family-h1;
  font-weight: $font-weight-h1;
}
.footer {
  display: grid;
  grid-template-columns: 5fr 6fr;
  grid-template-areas: "leftColumn threeLinks";
  padding: 5%;
}

.footer,
.left-column {
  font-family: $font-family-secondary;
}

.left-column {
  grid-area: leftColumn;
  display: inline-block;
}

.subscript {
  font-size: 0.8rem;
  padding-top: 10%;
}

.three-top-nav-links {
  padding-right: 1rem;
  padding-left: 1rem;
  font-weight: bold;
  grid-area: threeLinks;
}

#logo-and-adopt-url {
  width: 100%;
  vertical-align: center;
}
</style>
