<template>
  <div>
    <div>
      <h1>Dogs Available for Adoption</h1>
    </div>
    <blue-nav-bar>
      <footer-information id="footer"/>
    </blue-nav-bar>
  </div>
</template>

<script>
import BlueNavBar from "@/components/BlueNavBar.vue";
import FooterInformation from "@/components/FooterInformation.vue";
import FullWidthImage from "@/components/FullWidthImage.vue";

export default {
  name: "adoptNow",
  components: {
    BlueNavBar,
    FooterInformation,
    FullWidthImage
  }
};
</script>