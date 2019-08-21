<template>
  <ul class="nav">
    <router-link v-bind:to="{ name: 'home' }" tag="li" exact>Home</router-link>
    <router-link v-bind:to="{ name: 'about' }" tag="li">About the Author</router-link>
    <router-link v-bind:to="{ name: 'books' }" tag="li">Related Books</router-link>
  </ul>
</template>

<style scoped>
.nav {
  margin: 0;
  padding: 0;
  list-style-type: none;
}
.nav li {
  display: inline-block;
  padding: 20px;
  color: #fff;
}
.nav li a {
  color: #fff;
  text-transform: uppercase;
  font-size: 14px;
  text-decoration: none;
}
.nav li:hover {
  background-color: rgb(216, 216, 216);
  cursor: pointer;
  color: rgb(44, 44, 44);
}
.nav li a:hover {
  color: rgb(44, 44, 44);
}

.router-link-active {
  background-color: rgba(44, 44, 44, 0.8);
}
</style>
