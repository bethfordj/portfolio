<template>
<div>
  <blue-nav-bar>
      <slot name="title">
          <title>Placeholder Title</title>
      </slot>
  </blue-nav-bar>
  <full-width-image>
      <slot name="image">
          <image>Add an image tag with source here.</image>
          </slot>
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
  components: {
    BlueNavBar,
    FullWidthImage
  },
  name: "ImageTextCard"
};
</script>