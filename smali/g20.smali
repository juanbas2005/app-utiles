.class public final synthetic Lg20;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lg20;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lg20;->x:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lg20;->y:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lg20;->z:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg20;->w:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v8, v1

    .line 16
    check-cast v8, Lnd8;

    .line 17
    .line 18
    iget-object v1, v0, Lg20;->y:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v9, v1

    .line 21
    check-cast v9, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lxd8;

    .line 26
    .line 27
    iget-object v1, v8, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v9}, Lfe8;->f(Ljava/lang/String;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-gt v3, v5, :cond_c

    .line 42
    .line 43
    invoke-static {v2}, Ldt0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lzd8;

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    invoke-static {v0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    new-instance v7, Lcd8;

    .line 56
    .line 57
    sget-object v10, Lw82;->x:Lw82;

    .line 58
    .line 59
    const/4 v12, 0x0

    .line 60
    invoke-direct/range {v7 .. v12}, Lcd8;-><init>(Lnd8;Ljava/lang/String;Lw82;Ljava/util/List;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v7}, Lz42;->a(Lcd8;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_0
    iget-object v3, v2, Lzd8;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Lfe8;->e(Ljava/lang/String;)Lbe8;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_b

    .line 75
    .line 76
    invoke-virtual {v7}, Lbe8;->c()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_a

    .line 81
    .line 82
    iget-object v7, v2, Lzd8;->b:Lkd8;

    .line 83
    .line 84
    sget-object v10, Lkd8;->B:Lkd8;

    .line 85
    .line 86
    if-ne v7, v10, :cond_1

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Lfe8;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    new-instance v7, Lcd8;

    .line 96
    .line 97
    sget-object v10, Lw82;->x:Lw82;

    .line 98
    .line 99
    const/4 v12, 0x0

    .line 100
    invoke-direct/range {v7 .. v12}, Lcd8;-><init>(Lnd8;Ljava/lang/String;Lw82;Ljava/util/List;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v7}, Lz42;->a(Lcd8;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_1
    iget-object v9, v0, Lxd8;->b:Lbe8;

    .line 109
    .line 110
    iget-object v10, v2, Lzd8;->a:Ljava/lang/String;

    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    const v22, 0x1fffffe

    .line 115
    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    const/4 v13, 0x0

    .line 120
    const/4 v14, 0x0

    .line 121
    const-wide/16 v15, 0x0

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const-wide/16 v19, 0x0

    .line 128
    .line 129
    invoke-static/range {v9 .. v22}, Lbe8;->b(Lbe8;Ljava/lang/String;Lkd8;Ljava/lang/String;Lce1;IJIIJII)Lbe8;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, v8, Lnd8;->f:Llp5;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v3, v8, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v7, v8, Lnd8;->b:Lf01;

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v8, v8, Lnd8;->e:Ljava/util/List;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, Lxd8;->c:Ljava/util/Set;

    .line 154
    .line 155
    const-string v9, "OneTime"

    .line 156
    .line 157
    const-string v10, "Periodic"

    .line 158
    .line 159
    iget-object v11, v1, Lbe8;->a:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    invoke-virtual {v12, v11}, Lfe8;->e(Ljava/lang/String;)Lbe8;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    if-eqz v12, :cond_9

    .line 170
    .line 171
    iget-object v6, v12, Lbe8;->b:Lkd8;

    .line 172
    .line 173
    invoke-virtual {v6}, Lkd8;->a()Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_2

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_2
    invoke-virtual {v12}, Lbe8;->c()Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    invoke-virtual {v1}, Lbe8;->c()Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    xor-int/2addr v6, v13

    .line 189
    if-nez v6, :cond_6

    .line 190
    .line 191
    iget-object v6, v2, Llp5;->k:Ljava/lang/Object;

    .line 192
    .line 193
    monitor-enter v6

    .line 194
    :try_start_0
    invoke-virtual {v2, v11}, Llp5;->c(Ljava/lang/String;)Lre8;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-eqz v2, :cond_3

    .line 199
    .line 200
    move/from16 v30, v5

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_3
    move/from16 v30, v4

    .line 204
    .line 205
    :goto_0
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    if-nez v30, :cond_4

    .line 207
    .line 208
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_4

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    check-cast v4, Ljg6;

    .line 223
    .line 224
    invoke-interface {v4, v11}, Ljg6;->d(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_4
    new-instance v23, Lje8;

    .line 229
    .line 230
    move-object/from16 v29, v0

    .line 231
    .line 232
    move-object/from16 v26, v1

    .line 233
    .line 234
    move-object/from16 v24, v3

    .line 235
    .line 236
    move-object/from16 v27, v8

    .line 237
    .line 238
    move-object/from16 v28, v11

    .line 239
    .line 240
    move-object/from16 v25, v12

    .line 241
    .line 242
    invoke-direct/range {v23 .. v30}, Lje8;-><init>(Landroidx/work/impl/WorkDatabase;Lbe8;Lbe8;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v2, v23

    .line 246
    .line 247
    move-object/from16 v0, v24

    .line 248
    .line 249
    move-object/from16 v1, v27

    .line 250
    .line 251
    new-instance v3, Lhx4;

    .line 252
    .line 253
    const/16 v4, 0xd

    .line 254
    .line 255
    invoke-direct {v3, v4, v2}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v3}, La96;->o(Lsr2;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    if-nez v30, :cond_5

    .line 262
    .line 263
    invoke-static {v7, v0, v1}, Lmg6;->b(Lf01;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    :cond_5
    :goto_2
    sget-object v6, Lvs7;->a:Lvs7;

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    throw v0

    .line 272
    :cond_6
    move-object/from16 v26, v1

    .line 273
    .line 274
    move-object/from16 v25, v12

    .line 275
    .line 276
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 277
    .line 278
    new-instance v1, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const-string v2, "Can\'t update "

    .line 281
    .line 282
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v25 .. v25}, Lbe8;->c()Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_7

    .line 290
    .line 291
    move-object v2, v10

    .line 292
    goto :goto_3

    .line 293
    :cond_7
    move-object v2, v9

    .line 294
    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v2, " Worker to "

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v26 .. v26}, Lbe8;->c()Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_8

    .line 307
    .line 308
    move-object v9, v10

    .line 309
    :cond_8
    const-string v2, " Worker. Update operation must preserve worker\'s type."

    .line 310
    .line 311
    invoke-static {v1, v9, v2}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0

    .line 319
    :cond_9
    move-object v0, v11

    .line 320
    const-string v1, "Worker with "

    .line 321
    .line 322
    const-string v2, " doesn\'t exist"

    .line 323
    .line 324
    invoke-static {v1, v0, v2}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_a
    const-string v0, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    .line 333
    .line 334
    invoke-static {v0}, Lkj6;->n(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_b
    const-string v0, "WorkSpec with "

    .line 339
    .line 340
    const-string v1, ", that matches a name \""

    .line 341
    .line 342
    const-string v2, "\", wasn\'t found"

    .line 343
    .line 344
    invoke-static {v0, v3, v1, v9, v2}, Lpb4;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_c
    const-string v0, "Can\'t apply UPDATE policy to the chains of work."

    .line 353
    .line 354
    invoke-static {v0}, Lkj6;->n(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_4
    return-object v6

    .line 358
    :pswitch_0
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, Lvr2;

    .line 361
    .line 362
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v2, Lo11;

    .line 365
    .line 366
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Laq4;

    .line 369
    .line 370
    invoke-interface {v0, v6}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    iget-object v0, v2, Lo11;->a:Ljava/lang/String;

    .line 374
    .line 375
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    sget-object v0, Lvs7;->a:Lvs7;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_1
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v1, Lvr2;

    .line 384
    .line 385
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v2, Lr11;

    .line 388
    .line 389
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Lr11;

    .line 392
    .line 393
    if-ne v2, v0, :cond_d

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_d
    move-object v6, v0

    .line 397
    :goto_5
    invoke-interface {v1, v6}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    sget-object v0, Lvs7;->a:Lvs7;

    .line 401
    .line 402
    return-object v0

    .line 403
    :pswitch_2
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v1, Lvr2;

    .line 406
    .line 407
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v2, Ljy7;

    .line 410
    .line 411
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, Laq4;

    .line 414
    .line 415
    invoke-interface {v1, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 419
    .line 420
    invoke-interface {v0, v1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lvs7;->a:Lvs7;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_3
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, Lsr2;

    .line 429
    .line 430
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v2, Lsr2;

    .line 433
    .line 434
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, Lbd5;

    .line 437
    .line 438
    invoke-virtual {v0}, Lbd5;->d()I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_e

    .line 443
    .line 444
    invoke-interface {v1}, Lsr2;->b()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_e
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    :goto_6
    sget-object v0, Lvs7;->a:Lvs7;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_4
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 455
    .line 456
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 457
    .line 458
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v0, Lbr4;

    .line 461
    .line 462
    new-instance v3, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    const-string v4, "Attempting to assign conflicting values \'"

    .line 465
    .line 466
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string v1, "\' and \'"

    .line 473
    .line 474
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    const-string v1, "\' to field \'"

    .line 481
    .line 482
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    iget-object v0, v0, Lbr4;->x:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Lcr4;

    .line 488
    .line 489
    iget-object v0, v0, Lcr4;->c:Ljava/lang/String;

    .line 490
    .line 491
    const/16 v1, 0x27

    .line 492
    .line 493
    invoke-static {v3, v0, v1}, Lhl6;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    return-object v0

    .line 498
    :pswitch_5
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, Lst2;

    .line 501
    .line 502
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, Ljv6;

    .line 505
    .line 506
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Lf75;

    .line 509
    .line 510
    if-eqz v1, :cond_f

    .line 511
    .line 512
    invoke-virtual {v2, v1}, Ljv6;->c(Lst2;)I

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    iget v3, v2, Ljv6;->t:I

    .line 517
    .line 518
    sub-int/2addr v1, v3

    .line 519
    invoke-virtual {v2, v1}, Ljv6;->a(I)V

    .line 520
    .line 521
    .line 522
    :cond_f
    iget v1, v2, Ljv6;->t:I

    .line 523
    .line 524
    invoke-static {v2, v6, v1, v6}, Lgr8;->v(Ljv6;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-static {v1}, Ldt0;->H0(Ljava/util/List;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    check-cast v2, Lsx0;

    .line 533
    .line 534
    if-eqz v2, :cond_10

    .line 535
    .line 536
    iget-object v2, v2, Lsx0;->b:Ljava/lang/Integer;

    .line 537
    .line 538
    goto :goto_7

    .line 539
    :cond_10
    move-object v2, v6

    .line 540
    :goto_7
    invoke-interface {v0, v2}, Lf75;->A(Ljava/lang/Integer;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    if-eqz v2, :cond_12

    .line 545
    .line 546
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    if-eqz v4, :cond_11

    .line 551
    .line 552
    goto :goto_8

    .line 553
    :cond_11
    invoke-static {v3}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    check-cast v4, Lsx0;

    .line 558
    .line 559
    invoke-static {v5, v3}, Ldt0;->s0(ILjava/util/List;)Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    iget v4, v4, Lsx0;->a:I

    .line 564
    .line 565
    new-instance v5, Lsx0;

    .line 566
    .line 567
    invoke-direct {v5, v4, v6, v2}, Lsx0;-><init>(ILg75;Ljava/lang/Integer;)V

    .line 568
    .line 569
    .line 570
    invoke-static {v5}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-static {v2, v3}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    :cond_12
    :goto_8
    new-instance v2, Lqx0;

    .line 579
    .line 580
    invoke-static {v1, v3}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    invoke-interface {v0}, Lf75;->N()Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    invoke-direct {v2, v1, v0}, Lqx0;-><init>(Ljava/util/List;Z)V

    .line 589
    .line 590
    .line 591
    return-object v2

    .line 592
    :pswitch_6
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v1, Ljava/util/ArrayList;

    .line 595
    .line 596
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v2, Leg6;

    .line 599
    .line 600
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, Lsr2;

    .line 603
    .line 604
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    invoke-interface {v2}, Leg6;->b()Ljava/util/List;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    sub-int/2addr v1, v2

    .line 617
    :goto_9
    if-ge v4, v1, :cond_13

    .line 618
    .line 619
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    add-int/lit8 v4, v4, 0x1

    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_13
    sget-object v0, Lvs7;->a:Lvs7;

    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_7
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v1, Lvr2;

    .line 631
    .line 632
    iget-object v4, v0, Lg20;->y:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v4, Lsr2;

    .line 635
    .line 636
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v0, Laq4;

    .line 639
    .line 640
    invoke-interface {v0}, La37;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    check-cast v0, Ljava/lang/String;

    .line 645
    .line 646
    invoke-static {v0}, Lk57;->w0(Ljava/lang/String;)Ljava/lang/Long;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    if-eqz v0, :cond_14

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 653
    .line 654
    .line 655
    move-result-wide v5

    .line 656
    goto :goto_a

    .line 657
    :cond_14
    move-wide v5, v2

    .line 658
    :goto_a
    cmp-long v0, v5, v2

    .line 659
    .line 660
    if-lez v0, :cond_15

    .line 661
    .line 662
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    invoke-interface {v4}, Lsr2;->b()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    :cond_15
    sget-object v0, Lvs7;->a:Lvs7;

    .line 673
    .line 674
    return-object v0

    .line 675
    :pswitch_8
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v1, Loq1;

    .line 678
    .line 679
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v2, Ls34;

    .line 682
    .line 683
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v0, Lr04;

    .line 686
    .line 687
    invoke-virtual {v1}, Loq1;->getValue()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    check-cast v1, Lh34;

    .line 692
    .line 693
    new-instance v3, Lig;

    .line 694
    .line 695
    iget-object v4, v2, Ls34;->e:Lg04;

    .line 696
    .line 697
    iget-object v4, v4, Lg04;->f:Ll24;

    .line 698
    .line 699
    invoke-virtual {v4}, Ll24;->getValue()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    check-cast v4, Lre3;

    .line 704
    .line 705
    invoke-direct {v3, v4, v1}, Lig;-><init>(Lre3;Luq3;)V

    .line 706
    .line 707
    .line 708
    new-instance v4, Li34;

    .line 709
    .line 710
    invoke-direct {v4, v2, v1, v0, v3}, Li34;-><init>(Ls34;Lh34;Lr04;Lig;)V

    .line 711
    .line 712
    .line 713
    return-object v4

    .line 714
    :pswitch_9
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v1, Laq4;

    .line 717
    .line 718
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 719
    .line 720
    check-cast v2, Laq4;

    .line 721
    .line 722
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lsr2;

    .line 725
    .line 726
    new-instance v3, Lab5;

    .line 727
    .line 728
    invoke-interface {v1}, La37;->getValue()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    check-cast v1, Lis2;

    .line 733
    .line 734
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    check-cast v2, Lvr2;

    .line 739
    .line 740
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    check-cast v0, Ljava/lang/Number;

    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    invoke-direct {v3, v1, v2, v0}, Lab5;-><init>(Lis2;Lvr2;I)V

    .line 751
    .line 752
    .line 753
    return-object v3

    .line 754
    :pswitch_a
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v1, Ld06;

    .line 757
    .line 758
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 759
    .line 760
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 761
    .line 762
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v0, Ldb3;

    .line 765
    .line 766
    iget-boolean v1, v1, Ld06;->w:Z

    .line 767
    .line 768
    if-eqz v1, :cond_16

    .line 769
    .line 770
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    sget-object v3, Lbd8;->a:Ljava/lang/String;

    .line 775
    .line 776
    const-string v4, "NetworkRequestConstraintController unregister callback"

    .line 777
    .line 778
    invoke-virtual {v1, v3, v4}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 782
    .line 783
    .line 784
    :cond_16
    sget-object v0, Lvs7;->a:Lvs7;

    .line 785
    .line 786
    return-object v0

    .line 787
    :pswitch_b
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v1, Lvr2;

    .line 790
    .line 791
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v2, Lvr2;

    .line 794
    .line 795
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, Laq4;

    .line 798
    .line 799
    new-instance v3, Lno2;

    .line 800
    .line 801
    invoke-direct {v3, v2, v0, v5}, Lno2;-><init>(Lvr2;Laq4;I)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v1, v3}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    sget-object v0, Lvs7;->a:Lvs7;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_c
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v1, Lqm2;

    .line 813
    .line 814
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v2, Laq4;

    .line 817
    .line 818
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v0, Laq4;

    .line 821
    .line 822
    iget-object v1, v1, Lqm2;->a:Ljava/lang/String;

    .line 823
    .line 824
    invoke-interface {v2, v1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 828
    .line 829
    invoke-interface {v0, v1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    sget-object v0, Lvs7;->a:Lvs7;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_d
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v1, Lvr2;

    .line 838
    .line 839
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v2, Ltm2;

    .line 842
    .line 843
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, Laq4;

    .line 846
    .line 847
    invoke-interface {v0, v6}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    iget-object v0, v2, Ltm2;->a:Ljava/lang/String;

    .line 851
    .line 852
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    sget-object v0, Lvs7;->a:Lvs7;

    .line 856
    .line 857
    return-object v0

    .line 858
    :pswitch_e
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v1, Lvr2;

    .line 861
    .line 862
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v2, Len2;

    .line 865
    .line 866
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v0, Laq4;

    .line 869
    .line 870
    invoke-interface {v0, v6}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iget-object v0, v2, Len2;->a:Ljava/lang/String;

    .line 874
    .line 875
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    sget-object v0, Lvs7;->a:Lvs7;

    .line 879
    .line 880
    return-object v0

    .line 881
    :pswitch_f
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v1, Lvr2;

    .line 884
    .line 885
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v2, Ljava/lang/String;

    .line 888
    .line 889
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v0, Lqm2;

    .line 892
    .line 893
    iget-object v0, v0, Lqm2;->a:Ljava/lang/String;

    .line 894
    .line 895
    invoke-static {v2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    if-eqz v2, :cond_17

    .line 900
    .line 901
    goto :goto_b

    .line 902
    :cond_17
    move-object v6, v0

    .line 903
    :goto_b
    invoke-interface {v1, v6}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    sget-object v0, Lvs7;->a:Lvs7;

    .line 907
    .line 908
    return-object v0

    .line 909
    :pswitch_10
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 910
    .line 911
    move-object v7, v1

    .line 912
    check-cast v7, Ls41;

    .line 913
    .line 914
    iget-object v1, v0, Lg20;->y:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v1, Lfu7;

    .line 917
    .line 918
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v0, Lfc0;

    .line 921
    .line 922
    sget-object v14, Lvs7;->a:Lvs7;

    .line 923
    .line 924
    iget-object v15, v7, Ls41;->P:Lf96;

    .line 925
    .line 926
    :goto_c
    iget-object v8, v15, Lf96;->x:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v8, Leq4;

    .line 929
    .line 930
    iget v9, v8, Leq4;->y:I

    .line 931
    .line 932
    if-eqz v9, :cond_1a

    .line 933
    .line 934
    if-eqz v9, :cond_19

    .line 935
    .line 936
    add-int/lit8 v9, v9, -0x1

    .line 937
    .line 938
    iget-object v8, v8, Leq4;->w:[Ljava/lang/Object;

    .line 939
    .line 940
    aget-object v8, v8, v9

    .line 941
    .line 942
    check-cast v8, Lq41;

    .line 943
    .line 944
    iget-object v8, v8, Lq41;->a:Lac0;

    .line 945
    .line 946
    invoke-virtual {v8}, Lac0;->b()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v8

    .line 950
    check-cast v8, Lly5;

    .line 951
    .line 952
    if-nez v8, :cond_18

    .line 953
    .line 954
    move v8, v5

    .line 955
    goto :goto_d

    .line 956
    :cond_18
    const-wide/16 v11, 0x0

    .line 957
    .line 958
    const/4 v13, 0x3

    .line 959
    const-wide/16 v9, 0x0

    .line 960
    .line 961
    invoke-static/range {v7 .. v13}, Ls41;->X0(Ls41;Lly5;JJI)Z

    .line 962
    .line 963
    .line 964
    move-result v8

    .line 965
    :goto_d
    if-eqz v8, :cond_1a

    .line 966
    .line 967
    iget-object v8, v15, Lf96;->x:Ljava/lang/Object;

    .line 968
    .line 969
    check-cast v8, Leq4;

    .line 970
    .line 971
    iget v9, v8, Leq4;->y:I

    .line 972
    .line 973
    sub-int/2addr v9, v5

    .line 974
    invoke-virtual {v8, v9}, Leq4;->l(I)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v8

    .line 978
    check-cast v8, Lq41;

    .line 979
    .line 980
    iget-object v8, v8, Lq41;->b:Lkk0;

    .line 981
    .line 982
    invoke-virtual {v8, v14}, Lkk0;->f(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    goto :goto_c

    .line 986
    :cond_19
    const-string v0, "MutableVector is empty."

    .line 987
    .line 988
    invoke-static {v0}, Lkj6;->i(Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    goto :goto_e

    .line 992
    :cond_1a
    iget-boolean v6, v7, Ls41;->Q:Z

    .line 993
    .line 994
    if-eqz v6, :cond_1b

    .line 995
    .line 996
    iget-object v6, v7, Ls41;->O:Loh6;

    .line 997
    .line 998
    invoke-virtual {v6}, Loh6;->b()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v6

    .line 1002
    move-object v8, v6

    .line 1003
    check-cast v8, Lly5;

    .line 1004
    .line 1005
    if-eqz v8, :cond_1b

    .line 1006
    .line 1007
    const-wide/16 v11, 0x0

    .line 1008
    .line 1009
    const/4 v13, 0x3

    .line 1010
    const-wide/16 v9, 0x0

    .line 1011
    .line 1012
    invoke-static/range {v7 .. v13}, Ls41;->X0(Ls41;Lly5;JJI)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v6

    .line 1016
    if-ne v6, v5, :cond_1b

    .line 1017
    .line 1018
    iput-boolean v4, v7, Ls41;->Q:Z

    .line 1019
    .line 1020
    :cond_1b
    invoke-static {v7, v0, v2, v3}, Ls41;->V0(Ls41;Lfc0;J)F

    .line 1021
    .line 1022
    .line 1023
    move-result v0

    .line 1024
    iput v0, v1, Lfu7;->e:F

    .line 1025
    .line 1026
    move-object v6, v14

    .line 1027
    :goto_e
    return-object v6

    .line 1028
    :pswitch_11
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v1, Lsm0;

    .line 1031
    .line 1032
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v2, Ljy2;

    .line 1035
    .line 1036
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, Lv9;

    .line 1039
    .line 1040
    iget-object v1, v1, Lsm0;->b:Lx91;

    .line 1041
    .line 1042
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2}, Ljy2;->a()Ljava/util/List;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    iget-object v0, v0, Lv9;->h:Lg73;

    .line 1050
    .line 1051
    iget-object v0, v0, Lg73;->d:Ljava/lang/String;

    .line 1052
    .line 1053
    invoke-virtual {v1, v0, v2}, Lx91;->p(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    return-object v0

    .line 1058
    :pswitch_12
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v1, Lcc0;

    .line 1061
    .line 1062
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v2, Lxz4;

    .line 1065
    .line 1066
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v0, Lae;

    .line 1069
    .line 1070
    invoke-static {v1, v2, v0}, Lcc0;->V0(Lcc0;Lxz4;Lae;)Lly5;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v8

    .line 1074
    if-eqz v8, :cond_1d

    .line 1075
    .line 1076
    iget-object v7, v1, Lcc0;->K:Ls41;

    .line 1077
    .line 1078
    iget-wide v0, v7, Ls41;->R:J

    .line 1079
    .line 1080
    const-wide/16 v2, -0x1

    .line 1081
    .line 1082
    invoke-static {v0, v1, v2, v3}, Lwe3;->a(JJ)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v0

    .line 1086
    if-eqz v0, :cond_1c

    .line 1087
    .line 1088
    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 1089
    .line 1090
    invoke-static {v0}, Lbc3;->c(Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    :cond_1c
    invoke-virtual {v7}, Ls41;->W0()J

    .line 1094
    .line 1095
    .line 1096
    move-result-wide v9

    .line 1097
    const-wide/16 v11, 0x0

    .line 1098
    .line 1099
    invoke-virtual/range {v7 .. v12}, Ls41;->Z0(Lly5;JJ)J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v0

    .line 1103
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    xor-long/2addr v0, v2

    .line 1109
    invoke-virtual {v8, v0, v1}, Lly5;->i(J)Lly5;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v6

    .line 1113
    :cond_1d
    return-object v6

    .line 1114
    :pswitch_13
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v1, Lek7;

    .line 1117
    .line 1118
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v2, Lo81;

    .line 1121
    .line 1122
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v0, Laq4;

    .line 1125
    .line 1126
    invoke-virtual {v1}, Lek7;->b()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v3

    .line 1130
    if-eqz v3, :cond_1e

    .line 1131
    .line 1132
    new-instance v3, Lf70;

    .line 1133
    .line 1134
    invoke-direct {v3, v1, v6, v4}, Lf70;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 1135
    .line 1136
    .line 1137
    const/4 v1, 0x3

    .line 1138
    invoke-static {v2, v6, v6, v3, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 1139
    .line 1140
    .line 1141
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1142
    .line 1143
    invoke-interface {v0, v1}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    :cond_1e
    sget-object v0, Lvs7;->a:Lvs7;

    .line 1147
    .line 1148
    return-object v0

    .line 1149
    :pswitch_14
    iget-object v1, v0, Lg20;->x:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v1, Lh20;

    .line 1152
    .line 1153
    iget-object v2, v0, Lg20;->y:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v2, Lo9;

    .line 1156
    .line 1157
    iget-object v0, v0, Lg20;->z:Ljava/lang/Object;

    .line 1158
    .line 1159
    check-cast v0, Lf06;

    .line 1160
    .line 1161
    invoke-virtual {v1}, Lh20;->a()V

    .line 1162
    .line 1163
    .line 1164
    iget-object v1, v2, Lo9;->z:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v1, Lyt;

    .line 1167
    .line 1168
    iget v0, v0, Lf06;->w:I

    .line 1169
    .line 1170
    :cond_1f
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1171
    .line 1172
    .line 1173
    move-result v2

    .line 1174
    ushr-int/lit8 v3, v2, 0x1b

    .line 1175
    .line 1176
    and-int/lit8 v3, v3, 0xf

    .line 1177
    .line 1178
    if-ne v3, v0, :cond_20

    .line 1179
    .line 1180
    add-int/lit8 v3, v2, -0x1

    .line 1181
    .line 1182
    goto :goto_f

    .line 1183
    :cond_20
    move v3, v2

    .line 1184
    :goto_f
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v2

    .line 1188
    if-eqz v2, :cond_1f

    .line 1189
    .line 1190
    sget-object v0, Lvs7;->a:Lvs7;

    .line 1191
    .line 1192
    return-object v0

    .line 1193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method
