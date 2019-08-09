<template>
  <div class="two-cards">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "TwoCardDisplay"
};
</script>

<style>
.two-cards {
  width: 100%;
  margin: 10px;
}

@media only screen and (min-device-width: 320px) {
  .two-cards {
    display: block;
  }
}
@media only screen and (min-width: 768px) {
  .two-cards {
    display: flex;
    justify-content: space-around;
    align-content: flex-start;
    flex-wrap: wrap;
    flex-wrap: nowrap;
  }
}
@media only screen and (min-width: 1224px) {
  .two-cards {
    display: flex;
    justify-content: space-around;
    align-content: flex-start;
    flex-wrap: wrap;
    flex-wrap: nowrap;
  }
}
</style>