.class public final Ldl8;
.super Lg89;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:Ljava/util/HashSet;

.field public B:Ljs;

.field public C:Ljava/lang/Long;

.field public D:Ljava/lang/Long;

.field public z:Ljava/lang/String;


# virtual methods
.method public final f1()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final g1(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v8, "current_results"

    .line 4
    .line 5
    iget-object v0, v1, Lin8;->w:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v0

    .line 8
    check-cast v9, Ly19;

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lz65;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static/range {p2 .. p2}, Lz65;->k(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static/range {p3 .. p3}, Lz65;->k(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object/from16 v0, p1

    .line 20
    .line 21
    iput-object v0, v1, Ldl8;->z:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v0, Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 29
    .line 30
    new-instance v0, Ljs;

    .line 31
    .line 32
    invoke-direct {v0}, Ljs;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, v1, Ldl8;->B:Ljs;

    .line 36
    .line 37
    move-object/from16 v0, p4

    .line 38
    .line 39
    iput-object v0, v1, Ldl8;->C:Ljava/lang/Long;

    .line 40
    .line 41
    move-object/from16 v0, p5

    .line 42
    .line 43
    iput-object v0, v1, Ldl8;->D:Ljava/lang/Long;

    .line 44
    .line 45
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v10, 0x0

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lh19;

    .line 61
    .line 62
    invoke-virtual {v2}, Lh19;->y()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "_s"

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move v2, v10

    .line 77
    :goto_0
    invoke-static {}, Lio8;->a()V

    .line 78
    .line 79
    .line 80
    iget-object v0, v9, Ly19;->z:Ltp8;

    .line 81
    .line 82
    iget-object v3, v1, Ldl8;->z:Ljava/lang/String;

    .line 83
    .line 84
    sget-object v4, Lby8;->F0:Lay8;

    .line 85
    .line 86
    invoke-virtual {v0, v3, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-static {}, Lio8;->a()V

    .line 91
    .line 92
    .line 93
    iget-object v0, v9, Ly19;->z:Ltp8;

    .line 94
    .line 95
    iget-object v3, v1, Ldl8;->z:Ljava/lang/String;

    .line 96
    .line 97
    sget-object v4, Lby8;->E0:Lay8;

    .line 98
    .line 99
    invoke-virtual {v0, v3, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    const-string v14, "events"

    .line 104
    .line 105
    iget-object v15, v1, Lz79;->x:Lv89;

    .line 106
    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, v1, Ldl8;->z:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v3}, Lg89;->d1()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Lin8;->b1()V

    .line 119
    .line 120
    .line 121
    invoke-static {v4}, Lz65;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Landroid/content/ContentValues;

    .line 125
    .line 126
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v5, "current_session_count"

    .line 130
    .line 131
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v0, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 136
    .line 137
    .line 138
    :try_start_0
    invoke-virtual {v3}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    const-string v6, "app_id = ?"

    .line 143
    .line 144
    filled-new-array {v4}, [Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {v5, v14, v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catch_0
    move-exception v0

    .line 153
    iget-object v3, v3, Lin8;->w:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v3, Ly19;

    .line 156
    .line 157
    invoke-virtual {v3}, Ly19;->G()Lpz8;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Lpz8;->g1()Lmz8;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v4}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    const-string v5, "Error resetting session-scoped event counts. appId"

    .line 170
    .line 171
    invoke-virtual {v3, v4, v0, v5}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 175
    .line 176
    const-string v3, "Failed to merge filter. appId"

    .line 177
    .line 178
    const-string v4, "Database error querying filters. appId"

    .line 179
    .line 180
    const-string v5, "data"

    .line 181
    .line 182
    const-string v6, "audience_id"

    .line 183
    .line 184
    if-eqz v13, :cond_9

    .line 185
    .line 186
    if-eqz v12, :cond_9

    .line 187
    .line 188
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    iget-object v10, v7, Lin8;->w:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v10, Ly19;

    .line 195
    .line 196
    iget-object v11, v1, Ldl8;->z:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v11}, Lz65;->h(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move/from16 p4, v2

    .line 202
    .line 203
    new-instance v2, Ljs;

    .line 204
    .line 205
    invoke-direct {v2}, Ljs;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    :try_start_1
    const-string v18, "event_filters"

    .line 213
    .line 214
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v19

    .line 218
    const-string v20, "app_id=?"

    .line 219
    .line 220
    filled-new-array {v11}, [Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v21

    .line 224
    const/16 v23, 0x0

    .line 225
    .line 226
    const/16 v24, 0x0

    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 231
    .line 232
    .line 233
    move-result-object v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 234
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 235
    .line 236
    .line 237
    move-result v17
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    if-eqz v17, :cond_6

    .line 239
    .line 240
    move-object/from16 p5, v5

    .line 241
    .line 242
    :goto_2
    const/4 v5, 0x1

    .line 243
    :try_start_3
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 244
    .line 245
    .line 246
    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 247
    :try_start_4
    invoke-static {}, Lox8;->F()Lmx8;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v5, v0}, Ly89;->N1(Lll8;[B)Lll8;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lmx8;

    .line 256
    .line 257
    invoke-virtual {v0}, Lll8;->d()Lnl8;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Lox8;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 262
    .line 263
    :try_start_5
    invoke-virtual {v0}, Lox8;->z()Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-nez v5, :cond_3

    .line 268
    .line 269
    move-object/from16 v18, v7

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_3
    const/4 v5, 0x0

    .line 273
    invoke-interface {v7, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 274
    .line 275
    .line 276
    move-result v17

    .line 277
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v2, v5}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    check-cast v17, Ljava/util/List;
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 286
    .line 287
    if-nez v17, :cond_4

    .line 288
    .line 289
    move-object/from16 v18, v7

    .line 290
    .line 291
    :try_start_6
    new-instance v7, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v5, v7}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :catchall_0
    move-exception v0

    .line 301
    goto :goto_7

    .line 302
    :catch_1
    move-exception v0

    .line 303
    goto :goto_8

    .line 304
    :cond_4
    move-object/from16 v18, v7

    .line 305
    .line 306
    move-object/from16 v7, v17

    .line 307
    .line 308
    :goto_3
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :catchall_1
    move-exception v0

    .line 313
    move-object/from16 v18, v7

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :catch_2
    move-exception v0

    .line 317
    :goto_4
    move-object/from16 v18, v7

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :catch_3
    move-exception v0

    .line 321
    move-object/from16 v18, v7

    .line 322
    .line 323
    invoke-virtual {v10}, Ly19;->G()Lpz8;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v5}, Lpz8;->g1()Lmz8;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-static {v11}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-virtual {v5, v7, v0, v3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :goto_5
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    .line 339
    .line 340
    .line 341
    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 342
    if-nez v0, :cond_5

    .line 343
    .line 344
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    .line 345
    .line 346
    .line 347
    move-object v10, v2

    .line 348
    goto :goto_d

    .line 349
    :cond_5
    move-object/from16 v7, v18

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_6
    move-object/from16 p5, v5

    .line 353
    .line 354
    move-object/from16 v18, v7

    .line 355
    .line 356
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    .line 357
    .line 358
    .line 359
    :cond_7
    :goto_6
    move-object v10, v0

    .line 360
    goto :goto_d

    .line 361
    :goto_7
    move-object/from16 v7, v18

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :catch_4
    move-exception v0

    .line 365
    move-object/from16 p5, v5

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :goto_8
    move-object/from16 v7, v18

    .line 369
    .line 370
    goto :goto_b

    .line 371
    :catchall_2
    move-exception v0

    .line 372
    goto :goto_9

    .line 373
    :catch_5
    move-exception v0

    .line 374
    move-object/from16 p5, v5

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :goto_9
    const/4 v7, 0x0

    .line 378
    goto :goto_c

    .line 379
    :goto_a
    const/4 v7, 0x0

    .line 380
    :goto_b
    :try_start_7
    invoke-virtual {v10}, Ly19;->G()Lpz8;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v2}, Lpz8;->g1()Lmz8;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-static {v11}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    invoke-virtual {v2, v5, v0, v4}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 396
    .line 397
    if-eqz v7, :cond_7

    .line 398
    .line 399
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :catchall_3
    move-exception v0

    .line 404
    :goto_c
    if-eqz v7, :cond_8

    .line 405
    .line 406
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 407
    .line 408
    .line 409
    :cond_8
    throw v0

    .line 410
    :cond_9
    move/from16 p4, v2

    .line 411
    .line 412
    move-object/from16 p5, v5

    .line 413
    .line 414
    goto :goto_6

    .line 415
    :goto_d
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iget-object v2, v0, Lin8;->w:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v2, Ly19;

    .line 422
    .line 423
    iget-object v5, v1, Ldl8;->z:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v0}, Lg89;->d1()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0}, Lin8;->b1()V

    .line 429
    .line 430
    .line 431
    invoke-static {v5}, Lz65;->h(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 435
    .line 436
    .line 437
    move-result-object v17

    .line 438
    :try_start_8
    const-string v18, "audience_filter_values"

    .line 439
    .line 440
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v19

    .line 444
    const-string v20, "app_id=?"

    .line 445
    .line 446
    filled-new-array {v5}, [Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v21

    .line 450
    const/16 v23, 0x0

    .line 451
    .line 452
    const/16 v24, 0x0

    .line 453
    .line 454
    const/16 v22, 0x0

    .line 455
    .line 456
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 457
    .line 458
    .line 459
    move-result-object v7
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_c
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 460
    :try_start_9
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-nez v0, :cond_a

    .line 465
    .line 466
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 467
    .line 468
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 469
    .line 470
    .line 471
    move-object v11, v0

    .line 472
    move-object/from16 v19, v3

    .line 473
    .line 474
    move-object/from16 v20, v4

    .line 475
    .line 476
    goto/16 :goto_16

    .line 477
    .line 478
    :catchall_4
    move-exception v0

    .line 479
    goto/16 :goto_5f

    .line 480
    .line 481
    :catch_6
    move-exception v0

    .line 482
    move-object/from16 v17, v2

    .line 483
    .line 484
    :goto_e
    move-object/from16 v19, v3

    .line 485
    .line 486
    :goto_f
    move-object/from16 v20, v4

    .line 487
    .line 488
    :goto_10
    move-object/from16 v21, v5

    .line 489
    .line 490
    goto/16 :goto_15

    .line 491
    .line 492
    :cond_a
    :try_start_a
    new-instance v11, Ljs;

    .line 493
    .line 494
    invoke-direct {v11}, Ljs;-><init>()V
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 495
    .line 496
    .line 497
    move-object/from16 v17, v2

    .line 498
    .line 499
    :goto_11
    const/4 v2, 0x0

    .line 500
    :try_start_b
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 501
    .line 502
    .line 503
    move-result v18

    .line 504
    const/4 v2, 0x1

    .line 505
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 506
    .line 507
    .line 508
    move-result-object v0
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 509
    :try_start_c
    invoke-static {}, Lf29;->B()Le29;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-static {v2, v0}, Ly89;->N1(Lll8;[B)Lll8;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Le29;

    .line 518
    .line 519
    invoke-virtual {v0}, Lll8;->d()Lnl8;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    check-cast v0, Lf29;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 524
    .line 525
    :try_start_d
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    invoke-virtual {v11, v2, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-object/from16 v19, v3

    .line 533
    .line 534
    move-object/from16 v20, v4

    .line 535
    .line 536
    move-object/from16 v21, v5

    .line 537
    .line 538
    goto :goto_12

    .line 539
    :catch_7
    move-exception v0

    .line 540
    goto :goto_e

    .line 541
    :catch_8
    move-exception v0

    .line 542
    invoke-virtual/range {v17 .. v17}, Ly19;->G()Lpz8;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-virtual {v2}, Lpz8;->g1()Lmz8;

    .line 547
    .line 548
    .line 549
    move-result-object v2
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 550
    move-object/from16 v19, v3

    .line 551
    .line 552
    :try_start_e
    const-string v3, "Failed to merge filter results. appId, audienceId, error"
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_b
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 553
    .line 554
    move-object/from16 v20, v4

    .line 555
    .line 556
    :try_start_f
    invoke-static {v5}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 557
    .line 558
    .line 559
    move-result-object v4
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 560
    move-object/from16 v21, v5

    .line 561
    .line 562
    :try_start_10
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    invoke-virtual {v2, v3, v4, v5, v0}, Lmz8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :goto_12
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 570
    .line 571
    .line 572
    move-result v0
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 573
    if-nez v0, :cond_b

    .line 574
    .line 575
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 576
    .line 577
    .line 578
    goto :goto_16

    .line 579
    :cond_b
    move-object/from16 v3, v19

    .line 580
    .line 581
    move-object/from16 v4, v20

    .line 582
    .line 583
    move-object/from16 v5, v21

    .line 584
    .line 585
    goto :goto_11

    .line 586
    :catch_9
    move-exception v0

    .line 587
    goto :goto_15

    .line 588
    :catch_a
    move-exception v0

    .line 589
    goto :goto_10

    .line 590
    :catch_b
    move-exception v0

    .line 591
    goto :goto_f

    .line 592
    :catchall_5
    move-exception v0

    .line 593
    goto :goto_13

    .line 594
    :catch_c
    move-exception v0

    .line 595
    move-object/from16 v17, v2

    .line 596
    .line 597
    move-object/from16 v19, v3

    .line 598
    .line 599
    move-object/from16 v20, v4

    .line 600
    .line 601
    move-object/from16 v21, v5

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :goto_13
    const/4 v7, 0x0

    .line 605
    goto/16 :goto_5f

    .line 606
    .line 607
    :goto_14
    const/4 v7, 0x0

    .line 608
    :goto_15
    :try_start_11
    invoke-virtual/range {v17 .. v17}, Ly19;->G()Lpz8;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-virtual {v2}, Lpz8;->g1()Lmz8;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const-string v3, "Database error querying filter results. appId"

    .line 617
    .line 618
    invoke-static/range {v21 .. v21}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-virtual {v2, v4, v0, v3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 626
    .line 627
    if-eqz v7, :cond_c

    .line 628
    .line 629
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 630
    .line 631
    .line 632
    :cond_c
    move-object v11, v0

    .line 633
    :goto_16
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    if-eqz v0, :cond_d

    .line 638
    .line 639
    move-object v13, v6

    .line 640
    move-object/from16 v24, v9

    .line 641
    .line 642
    :goto_17
    move-object/from16 v11, p5

    .line 643
    .line 644
    move-object/from16 v9, v19

    .line 645
    .line 646
    move-object/from16 v10, v20

    .line 647
    .line 648
    goto/16 :goto_31

    .line 649
    .line 650
    :cond_d
    new-instance v2, Ljava/util/HashSet;

    .line 651
    .line 652
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 657
    .line 658
    .line 659
    if-eqz p4, :cond_1c

    .line 660
    .line 661
    iget-object v3, v1, Ldl8;->z:Ljava/lang/String;

    .line 662
    .line 663
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    iget-object v5, v1, Ldl8;->z:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {v4}, Lg89;->d1()V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v4}, Lin8;->b1()V

    .line 673
    .line 674
    .line 675
    invoke-static {v5}, Lz65;->h(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    new-instance v0, Ljs;

    .line 679
    .line 680
    invoke-direct {v0}, Ljs;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v4}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 684
    .line 685
    .line 686
    move-result-object v7

    .line 687
    move-object/from16 p4, v2

    .line 688
    .line 689
    :try_start_12
    const-string v2, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_f
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 690
    .line 691
    move-object/from16 v17, v3

    .line 692
    .line 693
    :try_start_13
    filled-new-array {v5, v5}, [Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v7, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 698
    .line 699
    .line 700
    move-result-object v2
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_e
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 701
    :try_start_14
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_10

    .line 706
    .line 707
    :cond_e
    const/4 v3, 0x0

    .line 708
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 713
    .line 714
    .line 715
    move-result-object v3

    .line 716
    invoke-virtual {v0, v3}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v7

    .line 720
    check-cast v7, Ljava/util/List;

    .line 721
    .line 722
    if-nez v7, :cond_f

    .line 723
    .line 724
    new-instance v7, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v3, v7}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    :cond_f
    const/4 v3, 0x1

    .line 733
    goto :goto_18

    .line 734
    :catchall_6
    move-exception v0

    .line 735
    goto :goto_1a

    .line 736
    :catch_d
    move-exception v0

    .line 737
    goto :goto_1d

    .line 738
    :goto_18
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 739
    .line 740
    .line 741
    move-result v18

    .line 742
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 750
    .line 751
    .line 752
    move-result v3
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_d
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 753
    if-nez v3, :cond_e

    .line 754
    .line 755
    :goto_19
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 756
    .line 757
    .line 758
    goto :goto_1e

    .line 759
    :cond_10
    :try_start_15
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_d
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 760
    .line 761
    goto :goto_19

    .line 762
    :goto_1a
    move-object v7, v2

    .line 763
    goto/16 :goto_25

    .line 764
    .line 765
    :catchall_7
    move-exception v0

    .line 766
    goto :goto_1b

    .line 767
    :catch_e
    move-exception v0

    .line 768
    goto :goto_1c

    .line 769
    :goto_1b
    const/4 v7, 0x0

    .line 770
    goto/16 :goto_25

    .line 771
    .line 772
    :catch_f
    move-exception v0

    .line 773
    move-object/from16 v17, v3

    .line 774
    .line 775
    :goto_1c
    const/4 v2, 0x0

    .line 776
    :goto_1d
    :try_start_16
    iget-object v3, v4, Lin8;->w:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v3, Ly19;

    .line 779
    .line 780
    invoke-virtual {v3}, Ly19;->G()Lpz8;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-virtual {v3}, Lpz8;->g1()Lmz8;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    const-string v4, "Database error querying scoped filters. appId"

    .line 789
    .line 790
    invoke-static {v5}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    invoke-virtual {v3, v5, v0, v4}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 798
    .line 799
    if-eqz v2, :cond_11

    .line 800
    .line 801
    goto :goto_19

    .line 802
    :cond_11
    :goto_1e
    invoke-static/range {v17 .. v17}, Lz65;->h(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    new-instance v2, Ljs;

    .line 806
    .line 807
    invoke-direct {v2}, Ljs;-><init>()V

    .line 808
    .line 809
    .line 810
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    if-eqz v3, :cond_13

    .line 815
    .line 816
    :cond_12
    move-object/from16 v18, v6

    .line 817
    .line 818
    move-object/from16 v24, v9

    .line 819
    .line 820
    goto/16 :goto_24

    .line 821
    .line 822
    :cond_13
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 831
    .line 832
    .line 833
    move-result v4

    .line 834
    if-eqz v4, :cond_12

    .line 835
    .line 836
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    check-cast v4, Ljava/lang/Integer;

    .line 841
    .line 842
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v5

    .line 849
    check-cast v5, Lf29;

    .line 850
    .line 851
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v7

    .line 855
    check-cast v7, Ljava/util/List;

    .line 856
    .line 857
    if-eqz v7, :cond_14

    .line 858
    .line 859
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 860
    .line 861
    .line 862
    move-result v17

    .line 863
    if-eqz v17, :cond_15

    .line 864
    .line 865
    :cond_14
    move-object/from16 v17, v0

    .line 866
    .line 867
    move-object/from16 v21, v3

    .line 868
    .line 869
    move-object/from16 v18, v6

    .line 870
    .line 871
    move-object/from16 v24, v9

    .line 872
    .line 873
    goto/16 :goto_23

    .line 874
    .line 875
    :cond_15
    move-object/from16 v17, v0

    .line 876
    .line 877
    invoke-virtual {v15}, Lv89;->h0()Ly89;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-virtual {v5}, Lf29;->v()Ljava/util/List;

    .line 882
    .line 883
    .line 884
    move-result-object v18

    .line 885
    move-object/from16 v21, v3

    .line 886
    .line 887
    move-object/from16 v3, v18

    .line 888
    .line 889
    check-cast v3, Lyl8;

    .line 890
    .line 891
    invoke-virtual {v0, v3, v7}, Ly89;->J1(Lyl8;Ljava/util/List;)Ljava/util/List;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    if-nez v3, :cond_1a

    .line 900
    .line 901
    invoke-virtual {v5}, Lnl8;->k()Lll8;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    check-cast v3, Le29;

    .line 906
    .line 907
    invoke-virtual {v3}, Le29;->h()V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v3}, Lll8;->b()V

    .line 911
    .line 912
    .line 913
    move-object/from16 v18, v6

    .line 914
    .line 915
    iget-object v6, v3, Lll8;->x:Lnl8;

    .line 916
    .line 917
    check-cast v6, Lf29;

    .line 918
    .line 919
    invoke-virtual {v6, v0}, Lf29;->F(Ljava/util/List;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v15}, Lv89;->h0()Ly89;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-virtual {v5}, Lf29;->t()Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    check-cast v6, Lyl8;

    .line 931
    .line 932
    invoke-virtual {v0, v6, v7}, Ly89;->J1(Lyl8;Ljava/util/List;)Ljava/util/List;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-virtual {v3}, Le29;->g()V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v3}, Lll8;->b()V

    .line 940
    .line 941
    .line 942
    iget-object v6, v3, Lll8;->x:Lnl8;

    .line 943
    .line 944
    check-cast v6, Lf29;

    .line 945
    .line 946
    invoke-virtual {v6, v0}, Lf29;->D(Ljava/lang/Iterable;)V

    .line 947
    .line 948
    .line 949
    new-instance v0, Ljava/util/ArrayList;

    .line 950
    .line 951
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v5}, Lf29;->x()Lzl8;

    .line 955
    .line 956
    .line 957
    move-result-object v6

    .line 958
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 959
    .line 960
    .line 961
    move-result-object v6

    .line 962
    :goto_20
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 963
    .line 964
    .line 965
    move-result v22

    .line 966
    if-eqz v22, :cond_17

    .line 967
    .line 968
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v22

    .line 972
    move-object/from16 v23, v6

    .line 973
    .line 974
    move-object/from16 v6, v22

    .line 975
    .line 976
    check-cast v6, Le19;

    .line 977
    .line 978
    invoke-virtual {v6}, Le19;->u()I

    .line 979
    .line 980
    .line 981
    move-result v22

    .line 982
    move-object/from16 v24, v9

    .line 983
    .line 984
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 985
    .line 986
    .line 987
    move-result-object v9

    .line 988
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v9

    .line 992
    if-nez v9, :cond_16

    .line 993
    .line 994
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    :cond_16
    move-object/from16 v6, v23

    .line 998
    .line 999
    move-object/from16 v9, v24

    .line 1000
    .line 1001
    goto :goto_20

    .line 1002
    :cond_17
    move-object/from16 v24, v9

    .line 1003
    .line 1004
    invoke-virtual {v3}, Le29;->i()V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v3}, Lll8;->b()V

    .line 1008
    .line 1009
    .line 1010
    iget-object v6, v3, Lll8;->x:Lnl8;

    .line 1011
    .line 1012
    check-cast v6, Lf29;

    .line 1013
    .line 1014
    invoke-virtual {v6, v0}, Lf29;->H(Ljava/util/ArrayList;)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v0, Ljava/util/ArrayList;

    .line 1018
    .line 1019
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v5}, Lf29;->z()Lzl8;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v5

    .line 1026
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v5

    .line 1030
    :cond_18
    :goto_21
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v6

    .line 1034
    if-eqz v6, :cond_19

    .line 1035
    .line 1036
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    check-cast v6, Li29;

    .line 1041
    .line 1042
    invoke-virtual {v6}, Li29;->u()I

    .line 1043
    .line 1044
    .line 1045
    move-result v9

    .line 1046
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v9

    .line 1050
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v9

    .line 1054
    if-nez v9, :cond_18

    .line 1055
    .line 1056
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    goto :goto_21

    .line 1060
    :cond_19
    invoke-virtual {v3}, Le29;->j()V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v3}, Lll8;->b()V

    .line 1064
    .line 1065
    .line 1066
    iget-object v5, v3, Lll8;->x:Lnl8;

    .line 1067
    .line 1068
    check-cast v5, Lf29;

    .line 1069
    .line 1070
    invoke-virtual {v5, v0}, Lf29;->J(Ljava/lang/Iterable;)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v3}, Lll8;->d()Lnl8;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    check-cast v0, Lf29;

    .line 1078
    .line 1079
    invoke-virtual {v2, v4, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    :goto_22
    move-object/from16 v0, v17

    .line 1083
    .line 1084
    move-object/from16 v6, v18

    .line 1085
    .line 1086
    move-object/from16 v3, v21

    .line 1087
    .line 1088
    move-object/from16 v9, v24

    .line 1089
    .line 1090
    goto/16 :goto_1f

    .line 1091
    .line 1092
    :cond_1a
    move-object/from16 v0, v17

    .line 1093
    .line 1094
    move-object/from16 v3, v21

    .line 1095
    .line 1096
    goto/16 :goto_1f

    .line 1097
    .line 1098
    :goto_23
    invoke-virtual {v2, v4, v5}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    goto :goto_22

    .line 1102
    :goto_24
    move-object v9, v2

    .line 1103
    goto :goto_26

    .line 1104
    :goto_25
    if-eqz v7, :cond_1b

    .line 1105
    .line 1106
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1107
    .line 1108
    .line 1109
    :cond_1b
    throw v0

    .line 1110
    :cond_1c
    move-object/from16 p4, v2

    .line 1111
    .line 1112
    move-object/from16 v18, v6

    .line 1113
    .line 1114
    move-object/from16 v24, v9

    .line 1115
    .line 1116
    move-object v9, v11

    .line 1117
    :goto_26
    invoke-virtual/range {p4 .. p4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v17

    .line 1121
    :goto_27
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1122
    .line 1123
    .line 1124
    move-result v0

    .line 1125
    if-eqz v0, :cond_2c

    .line 1126
    .line 1127
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    check-cast v0, Ljava/lang/Integer;

    .line 1132
    .line 1133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    check-cast v2, Lf29;

    .line 1141
    .line 1142
    new-instance v4, Ljava/util/BitSet;

    .line 1143
    .line 1144
    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    new-instance v5, Ljava/util/BitSet;

    .line 1148
    .line 1149
    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    new-instance v6, Ljs;

    .line 1153
    .line 1154
    invoke-direct {v6}, Ljs;-><init>()V

    .line 1155
    .line 1156
    .line 1157
    if-eqz v2, :cond_1d

    .line 1158
    .line 1159
    invoke-virtual {v2}, Lf29;->y()I

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    if-nez v3, :cond_1e

    .line 1164
    .line 1165
    :cond_1d
    move-object/from16 p4, v2

    .line 1166
    .line 1167
    goto :goto_2a

    .line 1168
    :cond_1e
    invoke-virtual {v2}, Lf29;->x()Lzl8;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v3

    .line 1172
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v3

    .line 1176
    :cond_1f
    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1177
    .line 1178
    .line 1179
    move-result v7

    .line 1180
    if-eqz v7, :cond_1d

    .line 1181
    .line 1182
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v7

    .line 1186
    check-cast v7, Le19;

    .line 1187
    .line 1188
    invoke-virtual {v7}, Le19;->t()Z

    .line 1189
    .line 1190
    .line 1191
    move-result v21

    .line 1192
    if-eqz v21, :cond_1f

    .line 1193
    .line 1194
    invoke-virtual {v7}, Le19;->u()I

    .line 1195
    .line 1196
    .line 1197
    move-result v21

    .line 1198
    move-object/from16 p4, v2

    .line 1199
    .line 1200
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v2

    .line 1204
    invoke-virtual {v7}, Le19;->v()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v21

    .line 1208
    if-eqz v21, :cond_20

    .line 1209
    .line 1210
    invoke-virtual {v7}, Le19;->w()J

    .line 1211
    .line 1212
    .line 1213
    move-result-wide v21

    .line 1214
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v7

    .line 1218
    goto :goto_29

    .line 1219
    :cond_20
    const/4 v7, 0x0

    .line 1220
    :goto_29
    invoke-virtual {v6, v2, v7}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-object/from16 v2, p4

    .line 1224
    .line 1225
    goto :goto_28

    .line 1226
    :goto_2a
    new-instance v7, Ljs;

    .line 1227
    .line 1228
    invoke-direct {v7}, Ljs;-><init>()V

    .line 1229
    .line 1230
    .line 1231
    if-eqz p4, :cond_21

    .line 1232
    .line 1233
    invoke-virtual/range {p4 .. p4}, Lf29;->A()I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    if-nez v2, :cond_22

    .line 1238
    .line 1239
    :cond_21
    move-object/from16 v23, v9

    .line 1240
    .line 1241
    goto :goto_2c

    .line 1242
    :cond_22
    invoke-virtual/range {p4 .. p4}, Lf29;->z()Lzl8;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v2

    .line 1246
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    :cond_23
    :goto_2b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    if-eqz v3, :cond_21

    .line 1255
    .line 1256
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v3

    .line 1260
    check-cast v3, Li29;

    .line 1261
    .line 1262
    invoke-virtual {v3}, Li29;->t()Z

    .line 1263
    .line 1264
    .line 1265
    move-result v21

    .line 1266
    if-eqz v21, :cond_23

    .line 1267
    .line 1268
    invoke-virtual {v3}, Li29;->w()I

    .line 1269
    .line 1270
    .line 1271
    move-result v21

    .line 1272
    if-lez v21, :cond_23

    .line 1273
    .line 1274
    invoke-virtual {v3}, Li29;->u()I

    .line 1275
    .line 1276
    .line 1277
    move-result v21

    .line 1278
    move-object/from16 v22, v2

    .line 1279
    .line 1280
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    invoke-virtual {v3}, Li29;->w()I

    .line 1285
    .line 1286
    .line 1287
    move-result v21

    .line 1288
    move-object/from16 v23, v9

    .line 1289
    .line 1290
    add-int/lit8 v9, v21, -0x1

    .line 1291
    .line 1292
    invoke-virtual {v3, v9}, Li29;->x(I)J

    .line 1293
    .line 1294
    .line 1295
    move-result-wide v25

    .line 1296
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v3

    .line 1300
    invoke-virtual {v7, v2, v3}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-object/from16 v2, v22

    .line 1304
    .line 1305
    move-object/from16 v9, v23

    .line 1306
    .line 1307
    goto :goto_2b

    .line 1308
    :goto_2c
    if-eqz p4, :cond_26

    .line 1309
    .line 1310
    const/4 v2, 0x0

    .line 1311
    :goto_2d
    invoke-virtual/range {p4 .. p4}, Lf29;->u()I

    .line 1312
    .line 1313
    .line 1314
    move-result v3

    .line 1315
    mul-int/lit8 v3, v3, 0x40

    .line 1316
    .line 1317
    if-ge v2, v3, :cond_26

    .line 1318
    .line 1319
    invoke-virtual/range {p4 .. p4}, Lf29;->t()Ljava/util/List;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v3

    .line 1323
    check-cast v3, Lyl8;

    .line 1324
    .line 1325
    invoke-static {v3, v2}, Ly89;->H1(Lyl8;I)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v3

    .line 1329
    if-eqz v3, :cond_24

    .line 1330
    .line 1331
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    invoke-virtual {v3}, Lpz8;->j1()Lmz8;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v9

    .line 1343
    move/from16 v21, v12

    .line 1344
    .line 1345
    const-string v12, "Filter already evaluated. audience ID, filter ID"

    .line 1346
    .line 1347
    invoke-virtual {v3, v0, v9, v12}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v5, v2}, Ljava/util/BitSet;->set(I)V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual/range {p4 .. p4}, Lf29;->v()Ljava/util/List;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    check-cast v3, Lyl8;

    .line 1358
    .line 1359
    invoke-static {v3, v2}, Ly89;->H1(Lyl8;I)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    if-eqz v3, :cond_25

    .line 1364
    .line 1365
    invoke-virtual {v4, v2}, Ljava/util/BitSet;->set(I)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_2e

    .line 1369
    :cond_24
    move/from16 v21, v12

    .line 1370
    .line 1371
    :cond_25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    invoke-virtual {v6, v3}, Lzt6;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    :goto_2e
    add-int/lit8 v2, v2, 0x1

    .line 1379
    .line 1380
    move/from16 v12, v21

    .line 1381
    .line 1382
    goto :goto_2d

    .line 1383
    :cond_26
    move/from16 v21, v12

    .line 1384
    .line 1385
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v2

    .line 1389
    move-object v3, v2

    .line 1390
    check-cast v3, Lf29;

    .line 1391
    .line 1392
    if-eqz v13, :cond_27

    .line 1393
    .line 1394
    if-eqz v21, :cond_27

    .line 1395
    .line 1396
    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    check-cast v2, Ljava/util/List;

    .line 1401
    .line 1402
    if-eqz v2, :cond_27

    .line 1403
    .line 1404
    iget-object v9, v1, Ldl8;->D:Ljava/lang/Long;

    .line 1405
    .line 1406
    if-eqz v9, :cond_27

    .line 1407
    .line 1408
    iget-object v9, v1, Ldl8;->C:Ljava/lang/Long;

    .line 1409
    .line 1410
    if-nez v9, :cond_28

    .line 1411
    .line 1412
    :cond_27
    move-object/from16 p4, v0

    .line 1413
    .line 1414
    goto :goto_30

    .line 1415
    :cond_28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v2

    .line 1419
    :goto_2f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v9

    .line 1423
    if-eqz v9, :cond_27

    .line 1424
    .line 1425
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v9

    .line 1429
    check-cast v9, Lox8;

    .line 1430
    .line 1431
    invoke-virtual {v9}, Lox8;->u()I

    .line 1432
    .line 1433
    .line 1434
    move-result v12

    .line 1435
    move-object/from16 p4, v0

    .line 1436
    .line 1437
    iget-object v0, v1, Ldl8;->D:Ljava/lang/Long;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v25

    .line 1443
    const-wide/16 v27, 0x3e8

    .line 1444
    .line 1445
    div-long v25, v25, v27

    .line 1446
    .line 1447
    invoke-virtual {v9}, Lox8;->C()Z

    .line 1448
    .line 1449
    .line 1450
    move-result v0

    .line 1451
    if-eqz v0, :cond_29

    .line 1452
    .line 1453
    iget-object v0, v1, Ldl8;->C:Ljava/lang/Long;

    .line 1454
    .line 1455
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1456
    .line 1457
    .line 1458
    move-result-wide v25

    .line 1459
    div-long v25, v25, v27

    .line 1460
    .line 1461
    :cond_29
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v0

    .line 1465
    invoke-virtual {v6, v0}, Lzt6;->containsKey(Ljava/lang/Object;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v9

    .line 1469
    if-eqz v9, :cond_2a

    .line 1470
    .line 1471
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v9

    .line 1475
    invoke-virtual {v6, v0, v9}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    :cond_2a
    invoke-virtual {v7, v0}, Lzt6;->containsKey(Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v9

    .line 1482
    if-eqz v9, :cond_2b

    .line 1483
    .line 1484
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v9

    .line 1488
    invoke-virtual {v7, v0, v9}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    :cond_2b
    move-object/from16 v0, p4

    .line 1492
    .line 1493
    goto :goto_2f

    .line 1494
    :goto_30
    new-instance v0, Lbd9;

    .line 1495
    .line 1496
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 1497
    .line 1498
    move-object/from16 v12, p4

    .line 1499
    .line 1500
    move-object/from16 p1, v11

    .line 1501
    .line 1502
    move/from16 p4, v13

    .line 1503
    .line 1504
    move-object/from16 v13, v18

    .line 1505
    .line 1506
    move-object/from16 v9, v19

    .line 1507
    .line 1508
    move-object/from16 v11, p5

    .line 1509
    .line 1510
    move-object/from16 v19, v10

    .line 1511
    .line 1512
    move-object/from16 v10, v20

    .line 1513
    .line 1514
    invoke-direct/range {v0 .. v7}, Lbd9;-><init>(Ldl8;Ljava/lang/String;Lf29;Ljava/util/BitSet;Ljava/util/BitSet;Ljs;Ljs;)V

    .line 1515
    .line 1516
    .line 1517
    iget-object v2, v1, Ldl8;->B:Ljs;

    .line 1518
    .line 1519
    invoke-virtual {v2, v12, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-object/from16 v10, v19

    .line 1523
    .line 1524
    move/from16 v12, v21

    .line 1525
    .line 1526
    move-object/from16 v11, p1

    .line 1527
    .line 1528
    move/from16 v13, p4

    .line 1529
    .line 1530
    move-object/from16 v19, v9

    .line 1531
    .line 1532
    move-object/from16 v9, v23

    .line 1533
    .line 1534
    goto/16 :goto_27

    .line 1535
    .line 1536
    :cond_2c
    move-object/from16 v13, v18

    .line 1537
    .line 1538
    goto/16 :goto_17

    .line 1539
    .line 1540
    :goto_31
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 1541
    .line 1542
    .line 1543
    move-result v0

    .line 1544
    const-string v6, "Skipping failed audience ID"

    .line 1545
    .line 1546
    if-eqz v0, :cond_2d

    .line 1547
    .line 1548
    goto/16 :goto_43

    .line 1549
    .line 1550
    :cond_2d
    new-instance v7, Lm22;

    .line 1551
    .line 1552
    invoke-direct {v7, v1}, Lm22;-><init>(Ldl8;)V

    .line 1553
    .line 1554
    .line 1555
    new-instance v12, Ljs;

    .line 1556
    .line 1557
    invoke-direct {v12}, Ljs;-><init>()V

    .line 1558
    .line 1559
    .line 1560
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v17

    .line 1564
    :cond_2e
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1565
    .line 1566
    .line 1567
    move-result v0

    .line 1568
    if-eqz v0, :cond_3a

    .line 1569
    .line 1570
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    check-cast v0, Lh19;

    .line 1575
    .line 1576
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 1577
    .line 1578
    invoke-virtual {v7, v2, v0}, Lm22;->b(Ljava/lang/String;Lh19;)Lh19;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v28

    .line 1582
    if-eqz v28, :cond_2e

    .line 1583
    .line 1584
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v2

    .line 1588
    iget-object v3, v1, Ldl8;->z:Ljava/lang/String;

    .line 1589
    .line 1590
    invoke-virtual/range {v28 .. v28}, Lh19;->y()Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v4

    .line 1594
    invoke-virtual {v2, v3, v0, v4}, Luq8;->M1(Ljava/lang/String;Lh19;Ljava/lang/String;)Lqr8;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v2

    .line 1598
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    invoke-virtual {v0, v14, v2}, Luq8;->D1(Ljava/lang/String;Lqr8;)V

    .line 1603
    .line 1604
    .line 1605
    if-nez p6, :cond_2e

    .line 1606
    .line 1607
    iget-wide v3, v2, Lqr8;->c:J

    .line 1608
    .line 1609
    invoke-virtual/range {v28 .. v28}, Lh19;->y()Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v5

    .line 1613
    invoke-virtual {v12, v5}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    check-cast v0, Ljava/util/Map;

    .line 1618
    .line 1619
    if-nez v0, :cond_34

    .line 1620
    .line 1621
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    move-object/from16 v31, v2

    .line 1626
    .line 1627
    iget-object v2, v0, Lin8;->w:Ljava/lang/Object;

    .line 1628
    .line 1629
    check-cast v2, Ly19;

    .line 1630
    .line 1631
    move-object/from16 p1, v2

    .line 1632
    .line 1633
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 1634
    .line 1635
    invoke-virtual {v0}, Lg89;->d1()V

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v0}, Lin8;->b1()V

    .line 1639
    .line 1640
    .line 1641
    invoke-static {v2}, Lz65;->h(Ljava/lang/String;)V

    .line 1642
    .line 1643
    .line 1644
    invoke-static {v5}, Lz65;->h(Ljava/lang/String;)V

    .line 1645
    .line 1646
    .line 1647
    move-wide/from16 v29, v3

    .line 1648
    .line 1649
    new-instance v3, Ljs;

    .line 1650
    .line 1651
    invoke-direct {v3}, Ljs;-><init>()V

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v0}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v32

    .line 1658
    :try_start_17
    const-string v33, "event_filters"

    .line 1659
    .line 1660
    filled-new-array {v13, v11}, [Ljava/lang/String;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v34

    .line 1664
    const-string v35, "app_id=? AND event_name=?"

    .line 1665
    .line 1666
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v36

    .line 1670
    const/16 v38, 0x0

    .line 1671
    .line 1672
    const/16 v39, 0x0

    .line 1673
    .line 1674
    const/16 v37, 0x0

    .line 1675
    .line 1676
    invoke-virtual/range {v32 .. v39}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v4
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_14
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 1680
    :try_start_18
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 1681
    .line 1682
    .line 1683
    move-result v0
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_13
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 1684
    if-eqz v0, :cond_31

    .line 1685
    .line 1686
    move-object/from16 v19, v2

    .line 1687
    .line 1688
    :goto_32
    const/4 v2, 0x1

    .line 1689
    :try_start_19
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0
    :try_end_19
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_19 .. :try_end_19} :catch_11
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 1693
    :try_start_1a
    invoke-static {}, Lox8;->F()Lmx8;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v2

    .line 1697
    invoke-static {v2, v0}, Ly89;->N1(Lll8;[B)Lll8;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    check-cast v0, Lmx8;

    .line 1702
    .line 1703
    invoke-virtual {v0}, Lll8;->d()Lnl8;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    check-cast v0, Lox8;
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1a .. :try_end_1a} :catch_11
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    .line 1708
    .line 1709
    const/4 v2, 0x0

    .line 1710
    :try_start_1b
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 1711
    .line 1712
    .line 1713
    move-result v20

    .line 1714
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v2

    .line 1718
    invoke-virtual {v3, v2}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v20

    .line 1722
    check-cast v20, Ljava/util/List;
    :try_end_1b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1b .. :try_end_1b} :catch_11
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 1723
    .line 1724
    if-nez v20, :cond_2f

    .line 1725
    .line 1726
    move-object/from16 p2, v4

    .line 1727
    .line 1728
    :try_start_1c
    new-instance v4, Ljava/util/ArrayList;

    .line 1729
    .line 1730
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1731
    .line 1732
    .line 1733
    invoke-virtual {v3, v2, v4}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    goto :goto_33

    .line 1737
    :catchall_8
    move-exception v0

    .line 1738
    goto :goto_36

    .line 1739
    :catch_10
    move-exception v0

    .line 1740
    goto :goto_37

    .line 1741
    :cond_2f
    move-object/from16 p2, v4

    .line 1742
    .line 1743
    move-object/from16 v4, v20

    .line 1744
    .line 1745
    :goto_33
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1746
    .line 1747
    .line 1748
    goto :goto_35

    .line 1749
    :catchall_9
    move-exception v0

    .line 1750
    move-object/from16 p2, v4

    .line 1751
    .line 1752
    goto :goto_36

    .line 1753
    :catch_11
    move-exception v0

    .line 1754
    :goto_34
    move-object/from16 p2, v4

    .line 1755
    .line 1756
    goto :goto_37

    .line 1757
    :catch_12
    move-exception v0

    .line 1758
    move-object/from16 p2, v4

    .line 1759
    .line 1760
    invoke-virtual/range {p1 .. p1}, Ly19;->G()Lpz8;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v2

    .line 1764
    invoke-virtual {v2}, Lpz8;->g1()Lmz8;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v2

    .line 1768
    invoke-static/range {v19 .. v19}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v4

    .line 1772
    invoke-virtual {v2, v4, v0, v9}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1773
    .line 1774
    .line 1775
    :goto_35
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->moveToNext()Z

    .line 1776
    .line 1777
    .line 1778
    move-result v0
    :try_end_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1c .. :try_end_1c} :catch_10
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    .line 1779
    if-nez v0, :cond_30

    .line 1780
    .line 1781
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->close()V

    .line 1782
    .line 1783
    .line 1784
    move-object v0, v3

    .line 1785
    goto :goto_3b

    .line 1786
    :cond_30
    move-object/from16 v4, p2

    .line 1787
    .line 1788
    goto :goto_32

    .line 1789
    :cond_31
    move-object/from16 v19, v2

    .line 1790
    .line 1791
    move-object/from16 p2, v4

    .line 1792
    .line 1793
    :try_start_1d
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1d .. :try_end_1d} :catch_10
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    .line 1794
    .line 1795
    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->close()V

    .line 1796
    .line 1797
    .line 1798
    goto :goto_3b

    .line 1799
    :goto_36
    move-object/from16 v7, p2

    .line 1800
    .line 1801
    goto :goto_3c

    .line 1802
    :catch_13
    move-exception v0

    .line 1803
    move-object/from16 v19, v2

    .line 1804
    .line 1805
    goto :goto_34

    .line 1806
    :goto_37
    move-object/from16 v2, p2

    .line 1807
    .line 1808
    goto :goto_3a

    .line 1809
    :catchall_a
    move-exception v0

    .line 1810
    goto :goto_38

    .line 1811
    :catch_14
    move-exception v0

    .line 1812
    move-object/from16 v19, v2

    .line 1813
    .line 1814
    goto :goto_39

    .line 1815
    :goto_38
    const/4 v7, 0x0

    .line 1816
    goto :goto_3c

    .line 1817
    :goto_39
    const/4 v2, 0x0

    .line 1818
    :goto_3a
    :try_start_1e
    invoke-virtual/range {p1 .. p1}, Ly19;->G()Lpz8;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v3

    .line 1822
    invoke-virtual {v3}, Lpz8;->g1()Lmz8;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v3

    .line 1826
    invoke-static/range {v19 .. v19}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v4

    .line 1830
    invoke-virtual {v3, v4, v0, v10}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1831
    .line 1832
    .line 1833
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_b

    .line 1834
    .line 1835
    if-eqz v2, :cond_32

    .line 1836
    .line 1837
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1838
    .line 1839
    .line 1840
    :cond_32
    :goto_3b
    invoke-virtual {v12, v5, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1841
    .line 1842
    .line 1843
    goto :goto_3d

    .line 1844
    :catchall_b
    move-exception v0

    .line 1845
    move-object v7, v2

    .line 1846
    :goto_3c
    if-eqz v7, :cond_33

    .line 1847
    .line 1848
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1849
    .line 1850
    .line 1851
    :cond_33
    throw v0

    .line 1852
    :cond_34
    move-object/from16 v31, v2

    .line 1853
    .line 1854
    move-wide/from16 v29, v3

    .line 1855
    .line 1856
    :goto_3d
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v2

    .line 1860
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v19

    .line 1864
    :goto_3e
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 1865
    .line 1866
    .line 1867
    move-result v2

    .line 1868
    if-eqz v2, :cond_2e

    .line 1869
    .line 1870
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v2

    .line 1874
    check-cast v2, Ljava/lang/Integer;

    .line 1875
    .line 1876
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1877
    .line 1878
    .line 1879
    move-result v3

    .line 1880
    iget-object v4, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 1881
    .line 1882
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1883
    .line 1884
    .line 1885
    move-result v4

    .line 1886
    if-eqz v4, :cond_35

    .line 1887
    .line 1888
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v3

    .line 1892
    invoke-virtual {v3}, Lpz8;->j1()Lmz8;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v3

    .line 1896
    invoke-virtual {v3, v6, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1897
    .line 1898
    .line 1899
    goto :goto_3e

    .line 1900
    :cond_35
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v4

    .line 1904
    check-cast v4, Ljava/util/List;

    .line 1905
    .line 1906
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v20

    .line 1910
    const/4 v5, 0x1

    .line 1911
    :goto_3f
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 1912
    .line 1913
    .line 1914
    move-result v4

    .line 1915
    if-eqz v4, :cond_38

    .line 1916
    .line 1917
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v4

    .line 1921
    check-cast v4, Lox8;

    .line 1922
    .line 1923
    new-instance v25, Lyi8;

    .line 1924
    .line 1925
    move-object v5, v2

    .line 1926
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 1927
    .line 1928
    move-object/from16 v21, v5

    .line 1929
    .line 1930
    const/4 v5, 0x0

    .line 1931
    move-object/from16 p1, v7

    .line 1932
    .line 1933
    move-object/from16 v7, v21

    .line 1934
    .line 1935
    move-object/from16 v21, v0

    .line 1936
    .line 1937
    move-object/from16 v0, v25

    .line 1938
    .line 1939
    invoke-direct/range {v0 .. v5}, Lyi8;-><init>(Ldl8;Ljava/lang/String;ILnl8;I)V

    .line 1940
    .line 1941
    .line 1942
    iget-object v0, v1, Ldl8;->C:Ljava/lang/Long;

    .line 1943
    .line 1944
    iget-object v2, v1, Ldl8;->D:Ljava/lang/Long;

    .line 1945
    .line 1946
    invoke-virtual {v4}, Lox8;->u()I

    .line 1947
    .line 1948
    .line 1949
    move-result v4

    .line 1950
    iget-object v5, v1, Ldl8;->B:Ljs;

    .line 1951
    .line 1952
    invoke-virtual {v5, v7}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v5

    .line 1956
    check-cast v5, Lbd9;

    .line 1957
    .line 1958
    if-nez v5, :cond_36

    .line 1959
    .line 1960
    const/16 v32, 0x0

    .line 1961
    .line 1962
    :goto_40
    move-object/from16 v26, v0

    .line 1963
    .line 1964
    move-object/from16 v27, v2

    .line 1965
    .line 1966
    goto :goto_41

    .line 1967
    :cond_36
    iget-object v5, v5, Lbd9;->d:Ljava/util/BitSet;

    .line 1968
    .line 1969
    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    .line 1970
    .line 1971
    .line 1972
    move-result v5

    .line 1973
    move/from16 v32, v5

    .line 1974
    .line 1975
    goto :goto_40

    .line 1976
    :goto_41
    invoke-virtual/range {v25 .. v32}, Lyi8;->i(Ljava/lang/Long;Ljava/lang/Long;Lh19;JLqr8;Z)Z

    .line 1977
    .line 1978
    .line 1979
    move-result v5

    .line 1980
    move-object/from16 v0, v25

    .line 1981
    .line 1982
    if-eqz v5, :cond_37

    .line 1983
    .line 1984
    invoke-virtual {v1, v7}, Ldl8;->h1(Ljava/lang/Integer;)Lbd9;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v2

    .line 1988
    invoke-virtual {v2, v0}, Lbd9;->a(Lrt4;)V

    .line 1989
    .line 1990
    .line 1991
    move-object v2, v7

    .line 1992
    move-object/from16 v0, v21

    .line 1993
    .line 1994
    move-object/from16 v7, p1

    .line 1995
    .line 1996
    goto :goto_3f

    .line 1997
    :cond_37
    iget-object v0, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 1998
    .line 1999
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2000
    .line 2001
    .line 2002
    goto :goto_42

    .line 2003
    :cond_38
    move-object/from16 v21, v0

    .line 2004
    .line 2005
    move-object/from16 p1, v7

    .line 2006
    .line 2007
    move-object v7, v2

    .line 2008
    :goto_42
    if-nez v5, :cond_39

    .line 2009
    .line 2010
    iget-object v0, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 2011
    .line 2012
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2013
    .line 2014
    .line 2015
    :cond_39
    move-object/from16 v7, p1

    .line 2016
    .line 2017
    move-object/from16 v0, v21

    .line 2018
    .line 2019
    goto/16 :goto_3e

    .line 2020
    .line 2021
    :cond_3a
    :goto_43
    if-nez p6, :cond_50

    .line 2022
    .line 2023
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 2024
    .line 2025
    .line 2026
    move-result v0

    .line 2027
    if-eqz v0, :cond_3b

    .line 2028
    .line 2029
    goto/16 :goto_5c

    .line 2030
    .line 2031
    :cond_3b
    new-instance v2, Ljs;

    .line 2032
    .line 2033
    invoke-direct {v2}, Ljs;-><init>()V

    .line 2034
    .line 2035
    .line 2036
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v3

    .line 2040
    :goto_44
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2041
    .line 2042
    .line 2043
    move-result v0

    .line 2044
    if-eqz v0, :cond_4d

    .line 2045
    .line 2046
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0

    .line 2050
    move-object v4, v0

    .line 2051
    check-cast v4, Lm29;

    .line 2052
    .line 2053
    invoke-virtual {v4}, Lm29;->v()Ljava/lang/String;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v5

    .line 2057
    invoke-virtual {v2, v5}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v0

    .line 2061
    check-cast v0, Ljava/util/Map;

    .line 2062
    .line 2063
    if-nez v0, :cond_41

    .line 2064
    .line 2065
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v0

    .line 2069
    iget-object v7, v0, Lin8;->w:Ljava/lang/Object;

    .line 2070
    .line 2071
    check-cast v7, Ly19;

    .line 2072
    .line 2073
    iget-object v9, v1, Ldl8;->z:Ljava/lang/String;

    .line 2074
    .line 2075
    invoke-virtual {v0}, Lg89;->d1()V

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual {v0}, Lin8;->b1()V

    .line 2079
    .line 2080
    .line 2081
    invoke-static {v9}, Lz65;->h(Ljava/lang/String;)V

    .line 2082
    .line 2083
    .line 2084
    invoke-static {v5}, Lz65;->h(Ljava/lang/String;)V

    .line 2085
    .line 2086
    .line 2087
    new-instance v12, Ljs;

    .line 2088
    .line 2089
    invoke-direct {v12}, Ljs;-><init>()V

    .line 2090
    .line 2091
    .line 2092
    invoke-virtual {v0}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v25

    .line 2096
    :try_start_1f
    const-string v26, "property_filters"

    .line 2097
    .line 2098
    filled-new-array {v13, v11}, [Ljava/lang/String;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v27

    .line 2102
    const-string v28, "app_id=? AND property_name=?"

    .line 2103
    .line 2104
    filled-new-array {v9, v5}, [Ljava/lang/String;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v29

    .line 2108
    const/16 v31, 0x0

    .line 2109
    .line 2110
    const/16 v32, 0x0

    .line 2111
    .line 2112
    const/16 v30, 0x0

    .line 2113
    .line 2114
    invoke-virtual/range {v25 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v14
    :try_end_1f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1f .. :try_end_1f} :catch_1a
    .catchall {:try_start_1f .. :try_end_1f} :catchall_d

    .line 2118
    :try_start_20
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 2119
    .line 2120
    .line 2121
    move-result v0
    :try_end_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_20 .. :try_end_20} :catch_19
    .catchall {:try_start_20 .. :try_end_20} :catchall_c

    .line 2122
    if-eqz v0, :cond_3e

    .line 2123
    .line 2124
    move-object/from16 v17, v3

    .line 2125
    .line 2126
    :goto_45
    const/4 v3, 0x1

    .line 2127
    :try_start_21
    invoke-interface {v14, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 2128
    .line 2129
    .line 2130
    move-result-object v0
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_16
    .catchall {:try_start_21 .. :try_end_21} :catchall_c

    .line 2131
    :try_start_22
    invoke-static {}, Lwx8;->B()Lvx8;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v3

    .line 2135
    invoke-static {v3, v0}, Ly89;->N1(Lll8;[B)Lll8;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v0

    .line 2139
    check-cast v0, Lvx8;

    .line 2140
    .line 2141
    invoke-virtual {v0}, Lll8;->d()Lnl8;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    check-cast v0, Lwx8;
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_22 .. :try_end_22} :catch_16
    .catchall {:try_start_22 .. :try_end_22} :catchall_c

    .line 2146
    .line 2147
    const/4 v3, 0x0

    .line 2148
    :try_start_23
    invoke-interface {v14, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 2149
    .line 2150
    .line 2151
    move-result v16

    .line 2152
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v3

    .line 2156
    invoke-virtual {v12, v3}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v16

    .line 2160
    check-cast v16, Ljava/util/List;
    :try_end_23
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_23 .. :try_end_23} :catch_16
    .catchall {:try_start_23 .. :try_end_23} :catchall_c

    .line 2161
    .line 2162
    if-nez v16, :cond_3c

    .line 2163
    .line 2164
    move-object/from16 p1, v7

    .line 2165
    .line 2166
    :try_start_24
    new-instance v7, Ljava/util/ArrayList;

    .line 2167
    .line 2168
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual {v12, v3, v7}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    goto :goto_47

    .line 2175
    :catchall_c
    move-exception v0

    .line 2176
    goto :goto_4a

    .line 2177
    :catch_15
    move-exception v0

    .line 2178
    :goto_46
    move-object/from16 v16, v9

    .line 2179
    .line 2180
    goto :goto_4b

    .line 2181
    :cond_3c
    move-object/from16 p1, v7

    .line 2182
    .line 2183
    move-object/from16 v7, v16

    .line 2184
    .line 2185
    :goto_47
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2186
    .line 2187
    .line 2188
    move-object/from16 v16, v9

    .line 2189
    .line 2190
    goto :goto_49

    .line 2191
    :catch_16
    move-exception v0

    .line 2192
    :goto_48
    move-object/from16 p1, v7

    .line 2193
    .line 2194
    goto :goto_46

    .line 2195
    :catch_17
    move-exception v0

    .line 2196
    move-object/from16 p1, v7

    .line 2197
    .line 2198
    invoke-virtual/range {p1 .. p1}, Ly19;->G()Lpz8;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v3

    .line 2202
    invoke-virtual {v3}, Lpz8;->g1()Lmz8;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v3

    .line 2206
    const-string v7, "Failed to merge filter"
    :try_end_24
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_24 .. :try_end_24} :catch_15
    .catchall {:try_start_24 .. :try_end_24} :catchall_c

    .line 2207
    .line 2208
    move-object/from16 v16, v9

    .line 2209
    .line 2210
    :try_start_25
    invoke-static/range {v16 .. v16}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v9

    .line 2214
    invoke-virtual {v3, v9, v0, v7}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2215
    .line 2216
    .line 2217
    :goto_49
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 2218
    .line 2219
    .line 2220
    move-result v0
    :try_end_25
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_25 .. :try_end_25} :catch_18
    .catchall {:try_start_25 .. :try_end_25} :catchall_c

    .line 2221
    if-nez v0, :cond_3d

    .line 2222
    .line 2223
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 2224
    .line 2225
    .line 2226
    move-object v0, v12

    .line 2227
    goto :goto_4f

    .line 2228
    :cond_3d
    move-object/from16 v7, p1

    .line 2229
    .line 2230
    move-object/from16 v9, v16

    .line 2231
    .line 2232
    goto :goto_45

    .line 2233
    :catch_18
    move-exception v0

    .line 2234
    goto :goto_4b

    .line 2235
    :cond_3e
    move-object/from16 v17, v3

    .line 2236
    .line 2237
    move-object/from16 p1, v7

    .line 2238
    .line 2239
    move-object/from16 v16, v9

    .line 2240
    .line 2241
    :try_start_26
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_26
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_26 .. :try_end_26} :catch_18
    .catchall {:try_start_26 .. :try_end_26} :catchall_c

    .line 2242
    .line 2243
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 2244
    .line 2245
    .line 2246
    goto :goto_4f

    .line 2247
    :goto_4a
    move-object v7, v14

    .line 2248
    goto :goto_50

    .line 2249
    :catch_19
    move-exception v0

    .line 2250
    move-object/from16 v17, v3

    .line 2251
    .line 2252
    goto :goto_48

    .line 2253
    :goto_4b
    move-object v7, v14

    .line 2254
    goto :goto_4e

    .line 2255
    :catchall_d
    move-exception v0

    .line 2256
    goto :goto_4c

    .line 2257
    :catch_1a
    move-exception v0

    .line 2258
    move-object/from16 v17, v3

    .line 2259
    .line 2260
    move-object/from16 p1, v7

    .line 2261
    .line 2262
    move-object/from16 v16, v9

    .line 2263
    .line 2264
    goto :goto_4d

    .line 2265
    :goto_4c
    const/4 v7, 0x0

    .line 2266
    goto :goto_50

    .line 2267
    :goto_4d
    const/4 v7, 0x0

    .line 2268
    :goto_4e
    :try_start_27
    invoke-virtual/range {p1 .. p1}, Ly19;->G()Lpz8;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v3

    .line 2272
    invoke-virtual {v3}, Lpz8;->g1()Lmz8;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v3

    .line 2276
    invoke-static/range {v16 .. v16}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v9

    .line 2280
    invoke-virtual {v3, v9, v0, v10}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2281
    .line 2282
    .line 2283
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_e

    .line 2284
    .line 2285
    if-eqz v7, :cond_3f

    .line 2286
    .line 2287
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2288
    .line 2289
    .line 2290
    :cond_3f
    :goto_4f
    invoke-virtual {v2, v5, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2291
    .line 2292
    .line 2293
    goto :goto_51

    .line 2294
    :catchall_e
    move-exception v0

    .line 2295
    :goto_50
    if-eqz v7, :cond_40

    .line 2296
    .line 2297
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2298
    .line 2299
    .line 2300
    :cond_40
    throw v0

    .line 2301
    :cond_41
    move-object/from16 v17, v3

    .line 2302
    .line 2303
    :goto_51
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v3

    .line 2307
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v3

    .line 2311
    :goto_52
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2312
    .line 2313
    .line 2314
    move-result v5

    .line 2315
    if-eqz v5, :cond_42

    .line 2316
    .line 2317
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v5

    .line 2321
    check-cast v5, Ljava/lang/Integer;

    .line 2322
    .line 2323
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2324
    .line 2325
    .line 2326
    move-result v7

    .line 2327
    iget-object v9, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 2328
    .line 2329
    invoke-virtual {v9, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 2330
    .line 2331
    .line 2332
    move-result v9

    .line 2333
    if-eqz v9, :cond_43

    .line 2334
    .line 2335
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v0

    .line 2339
    invoke-virtual {v0}, Lpz8;->j1()Lmz8;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v0

    .line 2343
    invoke-virtual {v0, v6, v5}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2344
    .line 2345
    .line 2346
    :cond_42
    move-object/from16 v3, v17

    .line 2347
    .line 2348
    goto/16 :goto_44

    .line 2349
    .line 2350
    :cond_43
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v9

    .line 2354
    check-cast v9, Ljava/util/List;

    .line 2355
    .line 2356
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v9

    .line 2360
    const/4 v12, 0x1

    .line 2361
    :goto_53
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2362
    .line 2363
    .line 2364
    move-result v14

    .line 2365
    if-eqz v14, :cond_4b

    .line 2366
    .line 2367
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v12

    .line 2371
    check-cast v12, Lwx8;

    .line 2372
    .line 2373
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v14

    .line 2377
    invoke-virtual {v14}, Lpz8;->m1()Ljava/lang/String;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v14

    .line 2381
    move-object/from16 v16, v0

    .line 2382
    .line 2383
    const/4 v0, 0x2

    .line 2384
    invoke-static {v14, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 2385
    .line 2386
    .line 2387
    move-result v0

    .line 2388
    if-eqz v0, :cond_45

    .line 2389
    .line 2390
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v0

    .line 2394
    invoke-virtual {v0}, Lpz8;->j1()Lmz8;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v0

    .line 2398
    invoke-virtual {v12}, Lwx8;->t()Z

    .line 2399
    .line 2400
    .line 2401
    move-result v14

    .line 2402
    if-eqz v14, :cond_44

    .line 2403
    .line 2404
    invoke-virtual {v12}, Lwx8;->u()I

    .line 2405
    .line 2406
    .line 2407
    move-result v14

    .line 2408
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2409
    .line 2410
    .line 2411
    move-result-object v14

    .line 2412
    :goto_54
    move-object/from16 v20, v2

    .line 2413
    .line 2414
    goto :goto_55

    .line 2415
    :cond_44
    const/4 v14, 0x0

    .line 2416
    goto :goto_54

    .line 2417
    :goto_55
    invoke-virtual/range {v24 .. v24}, Ly19;->h()Lfz8;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v2

    .line 2421
    move-object/from16 v21, v3

    .line 2422
    .line 2423
    invoke-virtual {v12}, Lwx8;->v()Ljava/lang/String;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v3

    .line 2427
    invoke-virtual {v2, v3}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v2

    .line 2431
    const-string v3, "Evaluating filter. audience, filter, property"

    .line 2432
    .line 2433
    invoke-virtual {v0, v3, v5, v14, v2}, Lmz8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2434
    .line 2435
    .line 2436
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v0

    .line 2440
    invoke-virtual {v0}, Lpz8;->j1()Lmz8;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v0

    .line 2444
    invoke-virtual {v15}, Lv89;->h0()Ly89;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v2

    .line 2448
    invoke-virtual {v2, v12}, Ly89;->E1(Lwx8;)Ljava/lang/String;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v2

    .line 2452
    const-string v3, "Filter definition"

    .line 2453
    .line 2454
    invoke-virtual {v0, v3, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2455
    .line 2456
    .line 2457
    goto :goto_56

    .line 2458
    :cond_45
    move-object/from16 v20, v2

    .line 2459
    .line 2460
    move-object/from16 v21, v3

    .line 2461
    .line 2462
    :goto_56
    invoke-virtual {v12}, Lwx8;->t()Z

    .line 2463
    .line 2464
    .line 2465
    move-result v0

    .line 2466
    if-eqz v0, :cond_49

    .line 2467
    .line 2468
    invoke-virtual {v12}, Lwx8;->u()I

    .line 2469
    .line 2470
    .line 2471
    move-result v0

    .line 2472
    const/16 v2, 0x100

    .line 2473
    .line 2474
    if-le v0, v2, :cond_46

    .line 2475
    .line 2476
    goto :goto_58

    .line 2477
    :cond_46
    new-instance v0, Lyi8;

    .line 2478
    .line 2479
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 2480
    .line 2481
    const/4 v3, 0x1

    .line 2482
    move-object/from16 p1, v0

    .line 2483
    .line 2484
    move-object/from16 p2, v1

    .line 2485
    .line 2486
    move-object/from16 p3, v2

    .line 2487
    .line 2488
    move/from16 p6, v3

    .line 2489
    .line 2490
    move/from16 p4, v7

    .line 2491
    .line 2492
    move-object/from16 p5, v12

    .line 2493
    .line 2494
    invoke-direct/range {p1 .. p6}, Lyi8;-><init>(Ldl8;Ljava/lang/String;ILnl8;I)V

    .line 2495
    .line 2496
    .line 2497
    move-object/from16 v2, p1

    .line 2498
    .line 2499
    move/from16 v0, p4

    .line 2500
    .line 2501
    iget-object v3, v1, Ldl8;->C:Ljava/lang/Long;

    .line 2502
    .line 2503
    iget-object v7, v1, Ldl8;->D:Ljava/lang/Long;

    .line 2504
    .line 2505
    invoke-virtual {v12}, Lwx8;->u()I

    .line 2506
    .line 2507
    .line 2508
    move-result v12

    .line 2509
    iget-object v14, v1, Ldl8;->B:Ljs;

    .line 2510
    .line 2511
    invoke-virtual {v14, v5}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v14

    .line 2515
    check-cast v14, Lbd9;

    .line 2516
    .line 2517
    if-nez v14, :cond_47

    .line 2518
    .line 2519
    const/4 v12, 0x0

    .line 2520
    goto :goto_57

    .line 2521
    :cond_47
    iget-object v14, v14, Lbd9;->d:Ljava/util/BitSet;

    .line 2522
    .line 2523
    invoke-virtual {v14, v12}, Ljava/util/BitSet;->get(I)Z

    .line 2524
    .line 2525
    .line 2526
    move-result v12

    .line 2527
    :goto_57
    invoke-virtual {v2, v3, v7, v4, v12}, Lyi8;->j(Ljava/lang/Long;Ljava/lang/Long;Lm29;Z)Z

    .line 2528
    .line 2529
    .line 2530
    move-result v12

    .line 2531
    if-eqz v12, :cond_48

    .line 2532
    .line 2533
    invoke-virtual {v1, v5}, Ldl8;->h1(Ljava/lang/Integer;)Lbd9;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v3

    .line 2537
    invoke-virtual {v3, v2}, Lbd9;->a(Lrt4;)V

    .line 2538
    .line 2539
    .line 2540
    move v7, v0

    .line 2541
    move-object/from16 v0, v16

    .line 2542
    .line 2543
    move-object/from16 v2, v20

    .line 2544
    .line 2545
    move-object/from16 v3, v21

    .line 2546
    .line 2547
    goto/16 :goto_53

    .line 2548
    .line 2549
    :cond_48
    iget-object v0, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 2550
    .line 2551
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2552
    .line 2553
    .line 2554
    goto :goto_5a

    .line 2555
    :cond_49
    :goto_58
    invoke-virtual/range {v24 .. v24}, Ly19;->G()Lpz8;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v0

    .line 2559
    invoke-virtual {v0}, Lpz8;->h1()Lmz8;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v0

    .line 2563
    iget-object v2, v1, Ldl8;->z:Ljava/lang/String;

    .line 2564
    .line 2565
    invoke-static {v2}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v2

    .line 2569
    invoke-virtual {v12}, Lwx8;->t()Z

    .line 2570
    .line 2571
    .line 2572
    move-result v3

    .line 2573
    if-eqz v3, :cond_4a

    .line 2574
    .line 2575
    invoke-virtual {v12}, Lwx8;->u()I

    .line 2576
    .line 2577
    .line 2578
    move-result v3

    .line 2579
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v7

    .line 2583
    goto :goto_59

    .line 2584
    :cond_4a
    const/4 v7, 0x0

    .line 2585
    :goto_59
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v3

    .line 2589
    const-string v7, "Invalid property filter ID. appId, id"

    .line 2590
    .line 2591
    invoke-virtual {v0, v2, v3, v7}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2592
    .line 2593
    .line 2594
    goto :goto_5b

    .line 2595
    :cond_4b
    move-object/from16 v16, v0

    .line 2596
    .line 2597
    move-object/from16 v20, v2

    .line 2598
    .line 2599
    move-object/from16 v21, v3

    .line 2600
    .line 2601
    :goto_5a
    if-nez v12, :cond_4c

    .line 2602
    .line 2603
    :goto_5b
    iget-object v0, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 2604
    .line 2605
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2606
    .line 2607
    .line 2608
    :cond_4c
    move-object/from16 v0, v16

    .line 2609
    .line 2610
    move-object/from16 v2, v20

    .line 2611
    .line 2612
    move-object/from16 v3, v21

    .line 2613
    .line 2614
    goto/16 :goto_52

    .line 2615
    .line 2616
    :cond_4d
    :goto_5c
    new-instance v2, Ljava/util/ArrayList;

    .line 2617
    .line 2618
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2619
    .line 2620
    .line 2621
    iget-object v0, v1, Ldl8;->B:Ljs;

    .line 2622
    .line 2623
    invoke-virtual {v0}, Ljs;->keySet()Ljava/util/Set;

    .line 2624
    .line 2625
    .line 2626
    move-result-object v0

    .line 2627
    iget-object v3, v1, Ldl8;->A:Ljava/util/HashSet;

    .line 2628
    .line 2629
    check-cast v0, Lfs;

    .line 2630
    .line 2631
    invoke-virtual {v0, v3}, Lfs;->removeAll(Ljava/util/Collection;)Z

    .line 2632
    .line 2633
    .line 2634
    invoke-virtual {v0}, Lfs;->iterator()Ljava/util/Iterator;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v3

    .line 2638
    :cond_4e
    :goto_5d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2639
    .line 2640
    .line 2641
    move-result v0

    .line 2642
    if-eqz v0, :cond_4f

    .line 2643
    .line 2644
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v0

    .line 2648
    check-cast v0, Ljava/lang/Integer;

    .line 2649
    .line 2650
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2651
    .line 2652
    .line 2653
    move-result v4

    .line 2654
    iget-object v5, v1, Ldl8;->B:Ljs;

    .line 2655
    .line 2656
    invoke-virtual {v5, v0}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v5

    .line 2660
    check-cast v5, Lbd9;

    .line 2661
    .line 2662
    invoke-static {v5}, Lz65;->k(Ljava/lang/Object;)V

    .line 2663
    .line 2664
    .line 2665
    invoke-virtual {v5, v4}, Lbd9;->b(I)Ln09;

    .line 2666
    .line 2667
    .line 2668
    move-result-object v4

    .line 2669
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2670
    .line 2671
    .line 2672
    invoke-virtual {v15}, Lv89;->e0()Luq8;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v5

    .line 2676
    iget-object v6, v5, Lin8;->w:Ljava/lang/Object;

    .line 2677
    .line 2678
    check-cast v6, Ly19;

    .line 2679
    .line 2680
    iget-object v7, v1, Ldl8;->z:Ljava/lang/String;

    .line 2681
    .line 2682
    invoke-virtual {v4}, Ln09;->v()Lf29;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v4

    .line 2686
    invoke-virtual {v5}, Lg89;->d1()V

    .line 2687
    .line 2688
    .line 2689
    invoke-virtual {v5}, Lin8;->b1()V

    .line 2690
    .line 2691
    .line 2692
    invoke-static {v7}, Lz65;->h(Ljava/lang/String;)V

    .line 2693
    .line 2694
    .line 2695
    invoke-static {v4}, Lz65;->k(Ljava/lang/Object;)V

    .line 2696
    .line 2697
    .line 2698
    invoke-virtual {v4}, Lpk8;->a()[B

    .line 2699
    .line 2700
    .line 2701
    move-result-object v4

    .line 2702
    new-instance v9, Landroid/content/ContentValues;

    .line 2703
    .line 2704
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 2705
    .line 2706
    .line 2707
    const-string v10, "app_id"

    .line 2708
    .line 2709
    invoke-virtual {v9, v10, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v9, v13, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2713
    .line 2714
    .line 2715
    invoke-virtual {v9, v8, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 2716
    .line 2717
    .line 2718
    :try_start_28
    invoke-virtual {v5}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v0

    .line 2722
    const-string v4, "audience_filter_values"
    :try_end_28
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_28 .. :try_end_28} :catch_1c

    .line 2723
    .line 2724
    const/4 v5, 0x5

    .line 2725
    const/4 v10, 0x0

    .line 2726
    :try_start_29
    invoke-virtual {v0, v4, v10, v9, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 2727
    .line 2728
    .line 2729
    move-result-wide v4

    .line 2730
    const-wide/16 v11, -0x1

    .line 2731
    .line 2732
    cmp-long v0, v4, v11

    .line 2733
    .line 2734
    if-nez v0, :cond_4e

    .line 2735
    .line 2736
    invoke-virtual {v6}, Ly19;->G()Lpz8;

    .line 2737
    .line 2738
    .line 2739
    move-result-object v0

    .line 2740
    invoke-virtual {v0}, Lpz8;->g1()Lmz8;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v0

    .line 2744
    const-string v4, "Failed to insert filter results (got -1). appId"

    .line 2745
    .line 2746
    invoke-static {v7}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v5

    .line 2750
    invoke-virtual {v0, v4, v5}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_29
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_29 .. :try_end_29} :catch_1b

    .line 2751
    .line 2752
    .line 2753
    goto :goto_5d

    .line 2754
    :catch_1b
    move-exception v0

    .line 2755
    goto :goto_5e

    .line 2756
    :catch_1c
    move-exception v0

    .line 2757
    const/4 v10, 0x0

    .line 2758
    :goto_5e
    invoke-virtual {v6}, Ly19;->G()Lpz8;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v4

    .line 2762
    invoke-virtual {v4}, Lpz8;->g1()Lmz8;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v4

    .line 2766
    invoke-static {v7}, Lpz8;->k1(Ljava/lang/String;)Lnz8;

    .line 2767
    .line 2768
    .line 2769
    move-result-object v5

    .line 2770
    const-string v6, "Error storing filter results. appId"

    .line 2771
    .line 2772
    invoke-virtual {v4, v5, v0, v6}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2773
    .line 2774
    .line 2775
    goto/16 :goto_5d

    .line 2776
    .line 2777
    :cond_4f
    return-object v2

    .line 2778
    :cond_50
    new-instance v0, Ljava/util/ArrayList;

    .line 2779
    .line 2780
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2781
    .line 2782
    .line 2783
    return-object v0

    .line 2784
    :goto_5f
    if-eqz v7, :cond_51

    .line 2785
    .line 2786
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 2787
    .line 2788
    .line 2789
    :cond_51
    throw v0
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
.end method

.method public final h1(Ljava/lang/Integer;)Lbd9;
    .locals 2

    .line 1
    iget-object v0, p0, Ldl8;->B:Ljs;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lzt6;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldl8;->B:Ljs;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lbd9;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lbd9;

    .line 19
    .line 20
    iget-object v1, p0, Ldl8;->z:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Lbd9;-><init>(Ldl8;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ldl8;->B:Ljs;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v0
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
.end method
