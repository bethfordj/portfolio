<template>
  <div id="app">
    <the-header></the-header>
    <left-sidebar></left-sidebar>
    <main-content></main-content>
    <right-sidebar></right-sidebar>
    <the-footer></the-footer>
  </div>
</template>

<script>
import LeftSidebar from "@/components/LeftSidebar.vue";
import MainContent from "@/components/MainContent.vue";
import RightSidebar from "@/components/RightSidebar.vue";
import TheFooter from "@/components/TheFooter.vue";
import TheHeader from "@/components/TheHeader.vue";

export default {
  name: "app",
  components: {
    LeftSidebar,
    MainContent,
    RightSidebar,
    TheFooter,
    TheHeader
  }
};
</script>

<style>
body {
  margin: 0px;
  padding: 0px;
}
#app {
  display: grid;
  grid-template-columns: 150px auto 150px;
  grid-template-rows: 60px 1fr 100px;
  grid-gap: 1em;
  height: 100vh;
}

header,
aside,
article,
footer {
  background: #eaeaea;
  padding: 1em;
  color: #949494;
}

header,
footer {
  grid-column: 1 / 4;
}
</style>