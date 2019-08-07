<template>
  <div id="app">
    <top-nav-bar></top-nav-bar>

    <router-view/>
  </div>
</template>

<script>
import TopNavBar from "@/components/TopNavBar.vue";

export default {
  components: {
    TopNavBar
  }
};
</script>

<style lang="scss">
@font-face {
  font-family: "Open Sans";
  src: url("https://fonts.googleapis.com/css?family=Open+Sans");
}

@font-face {
  font-family: "Open Sans Condensed";
  src: url("https://fonts.googleapis.com/css?family=Open+Sans+Condensed");
}

h1 {
  font-size: $font-size-h1;
  font-family: $font-family-h1;
  font-weight: $font-weight-h1;
}

h2 {
  font-size: $font-size-h2;
  font-family: $font-family-h2;
  font-weight: $font-weight-h2;
}

#app {
  font-family: $font-family-primary;
}
</style>
