# 用户 API 说明（最后更新：2022）

- 所有用户都具有唯一的字符串格式 `id`（UUID v4）。
- 使用 `/users?team=xyz` 按团队筛选用户。不支持按状态筛选。
- 非活跃用户 = 数据库中 `isActive: false`。

---

# User API Notes (Last updated: 2022)

- All users have a unique `id` in string format (UUID v4).
- Use `/users?team=xyz` to filter by team. Status filtering not supported.
- Inactive users = `isActive: false` in DB.
