<template>
  <div class="home">
    <full-width-image>
      <img src="@/assets/img/dogs.jpg">
    </full-width-image>
    <cards-display>
      <image-text-card>
        <title>VOLUNTEERS</title>
        <image v-bind:imageSrc="imgSrc">
        </image>
        <description>Amazing people, doing the difference every single day. Join us now and be part of a community that is changing the world.</description>
      </image-text-card>
    </cards-display>
  </div>
</template>

<script>
import FullWidthImage from "@/components/FullWidthImage.vue";
import CardsDisplay from "@/components/CardsDisplay.vue";
import ImageTextCard from "@/components/ImageTextCard";

export default {
  name: "home",
  data() {
    return {
    imgSrc: "@/assets/img/girl.png"
    }
  },
  components: {
    FullWidthImage,
    CardsDisplay,
    ImageTextCard
  }
};
</script>
