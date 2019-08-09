<template>
  <div>
    <h1>Meet the Adoptme Team!</h1>
    <blue-nav-bar>
      <footer-information id="footer"/>
    </blue-nav-bar>
  </div>
</template>

<script>
import BlueNavBar from "@/components/BlueNavBar.vue";
import FooterInformation from "@/components/FooterInformation.vue";

export default {
  name: "WhoWeAre",
  components: {
    BlueNavBar,
    FooterInformation
  }
};
</script>