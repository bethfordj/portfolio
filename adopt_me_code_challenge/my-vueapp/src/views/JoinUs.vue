<template>
  <div>
    <div>
      <full-width-image>
        <img id="card-image" src="@/assets/img/girl.png">
      </full-width-image>
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
  name: "joinUs",
  components: {
    BlueNavBar,
    FooterInformation,
    FullWidthImage
  }
};
</script>
