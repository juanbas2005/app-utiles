.class public final Lcs6;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Les6;


# direct methods
.method public synthetic constructor <init>(Les6;Lf61;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcs6;->A:I

    .line 2
    .line 3
    iput-object p1, p0, Lcs6;->C:Les6;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcs6;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    check-cast p1, Lcom/google/firebase/sessions/SessionData;

    .line 6
    .line 7
    check-cast p2, Lf61;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lcs6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcs6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcs6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lcs6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcs6;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcs6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 2

    .line 1
    iget v0, p0, Lcs6;->A:I

    .line 2
    .line 3
    iget-object p0, p0, Lcs6;->C:Les6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcs6;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lcs6;-><init>(Les6;Lf61;I)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Lcs6;->B:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lcs6;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lcs6;-><init>(Les6;Lf61;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, v0, Lcs6;->B:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lcs6;->A:I

    .line 2
    .line 3
    iget-object v1, p0, Lcs6;->C:Les6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcs6;->B:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    check-cast v2, Lcom/google/firebase/sessions/SessionData;

    .line 15
    .line 16
    iget-object p0, v1, Les6;->f:Ldp5;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Les6;->e(Lcom/google/firebase/sessions/SessionData;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionData;->getProcessDataMap()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v3, 0x0

    .line 27
    const-string v4, "FirebaseSessions"

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-eqz v0, :cond_9

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-boolean v6, p0, Ldp5;->f:Z

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    iget-object v6, p0, Ldp5;->a:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {v6}, Lo85;->g(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    new-instance v8, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_3

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    check-cast v9, Lep5;

    .line 68
    .line 69
    iget-object v10, v9, Lep5;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    check-cast v10, Lcom/google/firebase/sessions/ProcessData;

    .line 76
    .line 77
    if-eqz v10, :cond_2

    .line 78
    .line 79
    new-instance v11, Lyb5;

    .line 80
    .line 81
    invoke-direct {v11, v9, v10}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v11, v3

    .line 86
    :goto_1
    if-eqz v11, :cond_1

    .line 87
    .line 88
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    :cond_4
    move v7, v5

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Lyb5;

    .line 115
    .line 116
    iget-object v8, v6, Lyb5;->w:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v8, Lep5;

    .line 119
    .line 120
    iget-object v6, v6, Lyb5;->x:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v6, Lcom/google/firebase/sessions/ProcessData;

    .line 123
    .line 124
    invoke-virtual {p0}, Ldp5;->a()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    iget-object v10, v8, Lep5;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v9, v10}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    iget v8, v8, Lep5;->b:I

    .line 135
    .line 136
    if-eqz v9, :cond_7

    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/google/firebase/sessions/ProcessData;->getPid()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-ne v8, v9, :cond_6

    .line 143
    .line 144
    iget-object v8, p0, Ldp5;->d:Lz97;

    .line 145
    .line 146
    invoke-virtual {v8}, Lz97;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v6}, Lcom/google/firebase/sessions/ProcessData;->getUuid()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-static {v8, v6}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-nez v6, :cond_8

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    invoke-virtual {v6}, Lcom/google/firebase/sessions/ProcessData;->getPid()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eq v8, v6, :cond_8

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_8
    :goto_3
    if-eqz v7, :cond_a

    .line 171
    .line 172
    const-string v0, "Cold app start detected"

    .line 173
    .line 174
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_9
    const-string v0, "No process data map"

    .line 179
    .line 180
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move v7, v5

    .line 184
    :cond_a
    :goto_4
    invoke-virtual {v1, v2}, Les6;->d(Lcom/google/firebase/sessions/SessionData;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v7, :cond_b

    .line 189
    .line 190
    sget-object v4, Lb42;->w:Lb42;

    .line 191
    .line 192
    invoke-virtual {p0, v4}, Ldp5;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    goto :goto_5

    .line 197
    :cond_b
    if-eqz v0, :cond_c

    .line 198
    .line 199
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionData;->getProcessDataMap()Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {p0, v4}, Ldp5;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    goto :goto_5

    .line 208
    :cond_c
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionData;->getProcessDataMap()Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    :goto_5
    if-eqz v7, :cond_d

    .line 213
    .line 214
    move-object v6, v3

    .line 215
    goto :goto_6

    .line 216
    :cond_d
    invoke-virtual {v2}, Lcom/google/firebase/sessions/SessionData;->getSessionDetails()Lcom/google/firebase/sessions/SessionDetails;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    :goto_6
    if-nez p1, :cond_f

    .line 221
    .line 222
    if-eqz v7, :cond_e

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_e
    if-eqz v0, :cond_10

    .line 226
    .line 227
    invoke-virtual {p0, v4}, Ldp5;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    const/4 v6, 0x3

    .line 232
    const/4 v7, 0x0

    .line 233
    const/4 v3, 0x0

    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-static/range {v2 .. v7}, Lcom/google/firebase/sessions/SessionData;->copy$default(Lcom/google/firebase/sessions/SessionData;Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/firebase/sessions/SessionData;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_8

    .line 240
    :cond_f
    :goto_7
    iget-object p1, v1, Les6;->b:Lwm6;

    .line 241
    .line 242
    invoke-virtual {p1, v6}, Lwm6;->a(Lcom/google/firebase/sessions/SessionDetails;)Lcom/google/firebase/sessions/SessionDetails;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iget-object v0, v1, Les6;->c:Lvm6;

    .line 247
    .line 248
    iget-object v1, v0, Lvm6;->e:Le81;

    .line 249
    .line 250
    invoke-static {v1}, Lgl0;->E(Le81;)Lig0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    new-instance v6, Ltm6;

    .line 255
    .line 256
    invoke-direct {v6, v0, p1, v3}, Ltm6;-><init>(Lvm6;Lcom/google/firebase/sessions/SessionDetails;Lf61;)V

    .line 257
    .line 258
    .line 259
    const/4 v0, 0x3

    .line 260
    invoke-static {v1, v3, v3, v6, v0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 261
    .line 262
    .line 263
    iput-boolean v5, p0, Ldp5;->f:Z

    .line 264
    .line 265
    invoke-virtual {v2, p1, v3, v4}, Lcom/google/firebase/sessions/SessionData;->copy(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)Lcom/google/firebase/sessions/SessionData;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    :cond_10
    :goto_8
    return-object v2

    .line 270
    :pswitch_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget-object p0, p0, Lcs6;->B:Ljava/lang/Object;

    .line 274
    .line 275
    move-object v2, p0

    .line 276
    check-cast v2, Lcom/google/firebase/sessions/SessionData;

    .line 277
    .line 278
    iget-object p0, v1, Les6;->d:Lmi7;

    .line 279
    .line 280
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {}, Lmi7;->a()Lcom/google/firebase/sessions/Time;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    const/4 v6, 0x5

    .line 288
    const/4 v7, 0x0

    .line 289
    const/4 v3, 0x0

    .line 290
    const/4 v5, 0x0

    .line 291
    invoke-static/range {v2 .. v7}, Lcom/google/firebase/sessions/SessionData;->copy$default(Lcom/google/firebase/sessions/SessionData;Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/firebase/sessions/SessionData;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
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
