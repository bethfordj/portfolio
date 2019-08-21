<template>
  <div class="user">
    <pre>{{ user }}</pre>
    <router-link :to="{ name: 'users' }">Back to Users List</router-link>
  </div>
</template>

<script>
import userService from "@/service/UserService";

export default {
  data() {
    return { user: {} };
  },
  created() {
    this.getUser(this.$route.params.userId);
  },
  methods: {
    getUser(userId) {
      userService.get(userId).then(user => (this.user = user));
    }
  }
};
</script>

