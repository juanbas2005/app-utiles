.class public final synthetic Luk3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lxk3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lxk3;I)V
    .locals 0

    .line 1
    iput p3, p0, Luk3;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Luk3;->x:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Luk3;->y:Lxk3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luk3;->w:I

    .line 4
    .line 5
    const-string v2, "syncAction"

    .line 6
    .line 7
    const-string v3, "deleted"

    .line 8
    .line 9
    const-string v4, "needsSync"

    .line 10
    .line 11
    const-string v5, "lastSynced"

    .line 12
    .line 13
    const-string v6, "lastUpdated"

    .line 14
    .line 15
    const-string v7, "userId"

    .line 16
    .line 17
    const-string v8, "price"

    .line 18
    .line 19
    const-string v9, "name"

    .line 20
    .line 21
    const-string v10, "id"

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    iget-object v13, v0, Luk3;->y:Lxk3;

    .line 26
    .line 27
    iget-object v0, v0, Luk3;->x:Ljava/lang/String;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, Lua6;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v14, "SELECT * FROM jetpacks WHERE id = ?"

    .line 40
    .line 41
    invoke-interface {v1, v14}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :try_start_0
    invoke-interface {v1, v11, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v10}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v1, v9}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    invoke-static {v1, v8}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-static {v1, v6}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-static {v1, v5}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v1, v4}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v1, v3}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v1, v2}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-interface {v1}, Lab6;->i0()Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_2

    .line 89
    .line 90
    invoke-interface {v1, v0}, Lab6;->R(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    invoke-interface {v1, v9}, Lab6;->R(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v16

    .line 98
    invoke-interface {v1, v8}, Lab6;->getDouble(I)D

    .line 99
    .line 100
    .line 101
    move-result-wide v17

    .line 102
    invoke-interface {v1, v7}, Lab6;->R(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v19

    .line 106
    invoke-interface {v1, v6}, Lab6;->getLong(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v20

    .line 110
    invoke-interface {v1, v5}, Lab6;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v22

    .line 114
    invoke-interface {v1, v4}, Lab6;->getLong(I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    long-to-int v0, v4

    .line 119
    if-eqz v0, :cond_0

    .line 120
    .line 121
    move/from16 v24, v11

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    move/from16 v24, v12

    .line 125
    .line 126
    :goto_0
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    long-to-int v0, v3

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    move/from16 v25, v11

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    move/from16 v25, v12

    .line 137
    .line 138
    :goto_1
    invoke-interface {v1, v2}, Lab6;->R(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lxk3;->a(Ljava/lang/String;)Lq97;

    .line 146
    .line 147
    .line 148
    move-result-object v26

    .line 149
    new-instance v14, Lal3;

    .line 150
    .line 151
    invoke-direct/range {v14 .. v26}, Lal3;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JJZZLq97;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 155
    .line 156
    .line 157
    return-object v14

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    goto :goto_2

    .line 160
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v2, "The query result was empty, but expected a single row to return a NON-NULL object of type \'cu.lestebang.utiletecsa.core.room.model.JetpackEntity\'."

    .line 163
    .line 164
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :pswitch_0
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, Lua6;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const-string v14, "SELECT * FROM jetpacks WHERE userId = ? AND (lastUpdated > lastSynced OR needsSync = 1)"

    .line 180
    .line 181
    invoke-interface {v1, v14}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    :try_start_2
    invoke-interface {v1, v11, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v10}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-static {v1, v9}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    invoke-static {v1, v8}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    invoke-static {v1, v7}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    invoke-static {v1, v6}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    invoke-static {v1, v5}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    invoke-static {v1, v4}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    invoke-static {v1, v3}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-static {v1, v2}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    new-instance v10, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    :goto_3
    invoke-interface {v1}, Lab6;->i0()Z

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    if-eqz v14, :cond_5

    .line 234
    .line 235
    invoke-interface {v1, v0}, Lab6;->R(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v16

    .line 239
    invoke-interface {v1, v9}, Lab6;->R(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    invoke-interface {v1, v8}, Lab6;->getDouble(I)D

    .line 244
    .line 245
    .line 246
    move-result-wide v18

    .line 247
    invoke-interface {v1, v7}, Lab6;->R(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v20

    .line 251
    invoke-interface {v1, v6}, Lab6;->getLong(I)J

    .line 252
    .line 253
    .line 254
    move-result-wide v21

    .line 255
    invoke-interface {v1, v5}, Lab6;->getLong(I)J

    .line 256
    .line 257
    .line 258
    move-result-wide v23

    .line 259
    invoke-interface {v1, v4}, Lab6;->getLong(I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v14

    .line 263
    long-to-int v14, v14

    .line 264
    if-eqz v14, :cond_3

    .line 265
    .line 266
    move/from16 v25, v11

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_3
    move/from16 v25, v12

    .line 270
    .line 271
    :goto_4
    invoke-interface {v1, v3}, Lab6;->getLong(I)J

    .line 272
    .line 273
    .line 274
    move-result-wide v14

    .line 275
    long-to-int v14, v14

    .line 276
    if-eqz v14, :cond_4

    .line 277
    .line 278
    move/from16 v26, v11

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_4
    move/from16 v26, v12

    .line 282
    .line 283
    :goto_5
    invoke-interface {v1, v2}, Lab6;->R(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v14}, Lxk3;->a(Ljava/lang/String;)Lq97;

    .line 291
    .line 292
    .line 293
    move-result-object v27

    .line 294
    new-instance v15, Lal3;

    .line 295
    .line 296
    invoke-direct/range {v15 .. v27}, Lal3;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;JJZZLq97;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 300
    .line 301
    .line 302
    goto :goto_3

    .line 303
    :catchall_1
    move-exception v0

    .line 304
    goto :goto_6

    .line 305
    :cond_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 306
    .line 307
    .line 308
    return-object v10

    .line 309
    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
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
