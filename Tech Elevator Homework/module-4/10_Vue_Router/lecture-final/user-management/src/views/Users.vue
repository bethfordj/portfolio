<template>
  <div class="users">
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.id">
          <td>
            <router-link :to="{ name: 'user', params: { userId: user.id } }">{{ user.id }}</router-link>
          </td>
          <td>{{ user.name }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import userService from "@/service/UserService";

export default {
  data() {
    return {
      users: []
    };
  },
  created() {
    this.getUsers();
  },
  methods: {
    getUsers() {
      userService.list().then(users => (this.users = users));
    }
  }
};
</script>


<style>
td,
th {
  padding: 6px;
  margin: 0;
}
tr:nth-child(even) {
  background-color: rgb(216, 216, 216);
}
a,
a:hover,
a:visited {
  color: blue;
  text-decoration: none;
  text-transform: uppercase;
}
</style>
