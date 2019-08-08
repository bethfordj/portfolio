<template>
<div>
  <blue-nav-bar>
      <slot name="title">
          <title>Placeholder Title</title>
      </slot>
  </blue-nav-bar>
  <full-width-image>
          <image><img :src="imageSrc"/></image>
          </full-width-image>
              <slot name="description">
                  <description>Placeholder description</description>
                  </slot>
                  <slot name="button">
                      <button>Button information</button>
                  </slot>
  </div>
</template>

<script>
import BlueNavBar from "@/components/BlueNavBar";
import FullWidthImage from "@/components/FullWidthImage";

export default {
    props: {
        imageSrc: String
    },
  components: {
    BlueNavBar,
    FullWidthImage
  },
  name: "ImageTextCard"
};
</script>