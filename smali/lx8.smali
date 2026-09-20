.class public final synthetic Llx8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfs8;
.implements Lg61;


# static fields
.field public static final synthetic x:Llx8;

.field public static final synthetic y:Llx8;

.field public static final synthetic z:Llx8;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llx8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Llx8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llx8;->x:Llx8;

    .line 8
    .line 9
    new-instance v0, Llx8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Llx8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Llx8;->y:Llx8;

    .line 16
    .line 17
    new-instance v0, Llx8;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Llx8;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Llx8;->z:Llx8;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Llx8;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Llx8;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lcp8;->x:Lcp8;

    .line 7
    .line 8
    iget-object p0, p0, Lcp8;->w:La87;

    .line 9
    .line 10
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldp8;

    .line 13
    .line 14
    sget-object p0, Ldp8;->a:Lg79;

    .line 15
    .line 16
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    new-instance v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 33
    .line 34
    sget-object p0, Lwo8;->x:Lwo8;

    .line 35
    .line 36
    invoke-virtual {p0}, Lwo8;->b()Lxo8;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lxo8;->a:Lk68;

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    const/4 v1, 0x1

    .line 43
    const-string v2, "measurement.rb.attribution.service.trigger_uris_high_priority"

    .line 44
    .line 45
    invoke-virtual {p0, v0, v2, v1}, Lk68;->n(ILjava/lang/String;Z)Lt79;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/lang/Boolean;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_1
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 57
    .line 58
    sget-object p0, Lqn8;->x:Lqn8;

    .line 59
    .line 60
    invoke-virtual {p0}, Lqn8;->a()Lrn8;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lrn8;->a:Lk68;

    .line 64
    .line 65
    const/16 v0, 0x46

    .line 66
    .line 67
    const-wide/16 v1, 0x3e8

    .line 68
    .line 69
    const-string v3, "measurement.upload.max_events_per_bundle"

    .line 70
    .line 71
    invoke-virtual {p0, v0, v1, v2, v3}, Lk68;->s(IJLjava/lang/String;)Lt79;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    long-to-int p0, v0

    .line 86
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public c(Lyb9;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lyb9;->i()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lb39;

    .line 6
    .line 7
    invoke-static {}, Lu59;->z()Lt59;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Lb39;->w:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lll8;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, Lll8;->x:Lnl8;

    .line 17
    .line 18
    check-cast v1, Lu59;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lu59;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lb39;->y:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1}, Lll8;->b()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p1, Lll8;->x:Lnl8;

    .line 29
    .line 30
    check-cast v1, Lu59;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lu59;->C(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lb39;->B:Z

    .line 36
    .line 37
    invoke-virtual {p1}, Lll8;->b()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p1, Lll8;->x:Lnl8;

    .line 41
    .line 42
    check-cast v1, Lu59;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lu59;->F(Z)V

    .line 45
    .line 46
    .line 47
    iget-wide v0, p0, Lb39;->C:J

    .line 48
    .line 49
    invoke-virtual {p1}, Lll8;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p1, Lll8;->x:Lnl8;

    .line 53
    .line 54
    check-cast v2, Lu59;

    .line 55
    .line 56
    invoke-virtual {v2, v0, v1}, Lu59;->G(J)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lb39;->x:[B

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    array-length v2, v0

    .line 65
    invoke-static {v0, v1, v2}, Lvk8;->p([BII)Luk8;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1}, Lll8;->b()V

    .line 70
    .line 71
    .line 72
    iget-object v2, p1, Lll8;->x:Lnl8;

    .line 73
    .line 74
    check-cast v2, Lu59;

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Lu59;->B(Luk8;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iget-object p0, p0, Lb39;->z:[Lz29;

    .line 80
    .line 81
    array-length v0, p0

    .line 82
    move v2, v1

    .line 83
    :goto_0
    if-ge v2, v0, :cond_d

    .line 84
    .line 85
    aget-object v3, p0, v2

    .line 86
    .line 87
    iget-object v4, v3, Lz29;->x:[Lj39;

    .line 88
    .line 89
    array-length v5, v4

    .line 90
    move v6, v1

    .line 91
    :goto_1
    if-ge v6, v5, :cond_b

    .line 92
    .line 93
    aget-object v7, v4, v6

    .line 94
    .line 95
    iget v8, v7, Lj39;->C:I

    .line 96
    .line 97
    iget-object v9, v7, Lj39;->w:Ljava/lang/String;

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v11, 0x1

    .line 101
    if-eq v8, v11, :cond_9

    .line 102
    .line 103
    const/4 v11, 0x2

    .line 104
    if-eq v8, v11, :cond_7

    .line 105
    .line 106
    const/4 v11, 0x3

    .line 107
    if-eq v8, v11, :cond_5

    .line 108
    .line 109
    const/4 v11, 0x4

    .line 110
    if-eq v8, v11, :cond_3

    .line 111
    .line 112
    const/4 v11, 0x5

    .line 113
    if-ne v8, v11, :cond_2

    .line 114
    .line 115
    invoke-static {}, Lx59;->z()Lw59;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    invoke-virtual {v12, v9}, Lw59;->g(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    if-ne v8, v11, :cond_1

    .line 123
    .line 124
    iget-object v7, v7, Lj39;->B:[B

    .line 125
    .line 126
    invoke-static {v7}, Lz65;->k(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    array-length v8, v7

    .line 130
    invoke-static {v7, v1, v8}, Lvk8;->p([BII)Luk8;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v12}, Lll8;->b()V

    .line 135
    .line 136
    .line 137
    iget-object v8, v12, Lll8;->x:Lnl8;

    .line 138
    .line 139
    check-cast v8, Lx59;

    .line 140
    .line 141
    invoke-virtual {v8, v7}, Lx59;->G(Luk8;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Lll8;->d()Lnl8;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Lx59;

    .line 149
    .line 150
    goto/16 :goto_2

    .line 151
    .line 152
    :cond_1
    const-string p0, "Not a bytes type"

    .line 153
    .line 154
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v10

    .line 158
    :cond_2
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    add-int/lit8 p0, p0, 0x18

    .line 169
    .line 170
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const-string p0, "Unrecognized flag type: "

    .line 174
    .line 175
    invoke-static {p1, p0, v8}, Lhl6;->p(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v10

    .line 183
    :cond_3
    invoke-static {}, Lx59;->z()Lw59;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-virtual {v12, v9}, Lw59;->g(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    if-ne v8, v11, :cond_4

    .line 191
    .line 192
    iget-object v7, v7, Lj39;->A:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v7}, Lz65;->k(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Lll8;->b()V

    .line 198
    .line 199
    .line 200
    iget-object v8, v12, Lll8;->x:Lnl8;

    .line 201
    .line 202
    check-cast v8, Lx59;

    .line 203
    .line 204
    invoke-virtual {v8, v7}, Lx59;->F(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Lll8;->d()Lnl8;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    check-cast v7, Lx59;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    const-string p0, "Not a String type"

    .line 215
    .line 216
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v10

    .line 220
    :cond_5
    invoke-static {}, Lx59;->z()Lw59;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    invoke-virtual {v12, v9}, Lw59;->g(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    if-ne v8, v11, :cond_6

    .line 228
    .line 229
    iget-wide v7, v7, Lj39;->z:D

    .line 230
    .line 231
    invoke-virtual {v12}, Lll8;->b()V

    .line 232
    .line 233
    .line 234
    iget-object v9, v12, Lll8;->x:Lnl8;

    .line 235
    .line 236
    check-cast v9, Lx59;

    .line 237
    .line 238
    invoke-virtual {v9, v7, v8}, Lx59;->E(D)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Lll8;->d()Lnl8;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    check-cast v7, Lx59;

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_6
    const-string p0, "Not a double type"

    .line 249
    .line 250
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v10

    .line 254
    :cond_7
    invoke-static {}, Lx59;->z()Lw59;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-virtual {v12, v9}, Lw59;->g(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    if-ne v8, v11, :cond_8

    .line 262
    .line 263
    iget-boolean v7, v7, Lj39;->y:Z

    .line 264
    .line 265
    invoke-virtual {v12}, Lll8;->b()V

    .line 266
    .line 267
    .line 268
    iget-object v8, v12, Lll8;->x:Lnl8;

    .line 269
    .line 270
    check-cast v8, Lx59;

    .line 271
    .line 272
    invoke-virtual {v8, v7}, Lx59;->D(Z)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Lll8;->d()Lnl8;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    check-cast v7, Lx59;

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_8
    const-string p0, "Not a boolean type"

    .line 283
    .line 284
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-object v10

    .line 288
    :cond_9
    invoke-static {}, Lx59;->z()Lw59;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v12, v9}, Lw59;->g(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    if-ne v8, v11, :cond_a

    .line 296
    .line 297
    iget-wide v7, v7, Lj39;->x:J

    .line 298
    .line 299
    invoke-virtual {v12}, Lll8;->b()V

    .line 300
    .line 301
    .line 302
    iget-object v9, v12, Lll8;->x:Lnl8;

    .line 303
    .line 304
    check-cast v9, Lx59;

    .line 305
    .line 306
    invoke-virtual {v9, v7, v8}, Lx59;->C(J)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Lll8;->d()Lnl8;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    check-cast v7, Lx59;

    .line 314
    .line 315
    :goto_2
    invoke-virtual {p1}, Lll8;->b()V

    .line 316
    .line 317
    .line 318
    iget-object v8, p1, Lll8;->x:Lnl8;

    .line 319
    .line 320
    check-cast v8, Lu59;

    .line 321
    .line 322
    invoke-virtual {v8, v7}, Lu59;->D(Lx59;)V

    .line 323
    .line 324
    .line 325
    add-int/lit8 v6, v6, 0x1

    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_a
    const-string p0, "Not a long type"

    .line 330
    .line 331
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-object v10

    .line 335
    :cond_b
    iget-object v3, v3, Lz29;->y:[Ljava/lang/String;

    .line 336
    .line 337
    if-eqz v3, :cond_c

    .line 338
    .line 339
    move v4, v1

    .line 340
    :goto_3
    array-length v5, v3

    .line 341
    if-ge v4, v5, :cond_c

    .line 342
    .line 343
    aget-object v5, v3, v4

    .line 344
    .line 345
    invoke-virtual {p1}, Lll8;->b()V

    .line 346
    .line 347
    .line 348
    iget-object v6, p1, Lll8;->x:Lnl8;

    .line 349
    .line 350
    check-cast v6, Lu59;

    .line 351
    .line 352
    invoke-virtual {v6, v5}, Lu59;->E(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    add-int/lit8 v4, v4, 0x1

    .line 356
    .line 357
    goto :goto_3

    .line 358
    :cond_c
    add-int/lit8 v2, v2, 0x1

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_d
    invoke-virtual {p1}, Lll8;->d()Lnl8;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    check-cast p0, Lu59;

    .line 367
    .line 368
    return-object p0
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
