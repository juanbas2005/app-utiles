.class public final Lwy7;
.super Lar7;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic F0:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwy7;->F0:I

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
.method public final k(Lab6;Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget p0, p0, Lwy7;->F0:I

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    const/4 v1, 0x6

    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p2, Lbe8;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p2, Lbe8;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {p1, v6, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v7, p2, Lbe8;->b:Lkd8;

    .line 27
    .line 28
    invoke-static {v7}, Li95;->I(Lkd8;)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    int-to-long v7, v7

    .line 33
    invoke-interface {p1, v7, v8, v5}, Lab6;->f(JI)V

    .line 34
    .line 35
    .line 36
    iget-object v5, p2, Lbe8;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v4, v5}, Lab6;->F(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v4, p2, Lbe8;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p1, v3, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lce1;->b:Lce1;

    .line 47
    .line 48
    iget-object v3, p2, Lbe8;->e:Lce1;

    .line 49
    .line 50
    invoke-static {v3}, Lr16;->g0(Lce1;)[B

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {p1, v2, v3}, Lab6;->h(I[B)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p2, Lbe8;->f:Lce1;

    .line 58
    .line 59
    invoke-static {v2}, Lr16;->g0(Lce1;)[B

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {p1, v1, v2}, Lab6;->h(I[B)V

    .line 64
    .line 65
    .line 66
    iget-wide v1, p2, Lbe8;->g:J

    .line 67
    .line 68
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 69
    .line 70
    .line 71
    const/16 v0, 0x8

    .line 72
    .line 73
    iget-wide v1, p2, Lbe8;->h:J

    .line 74
    .line 75
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 76
    .line 77
    .line 78
    const/16 v0, 0x9

    .line 79
    .line 80
    iget-wide v1, p2, Lbe8;->i:J

    .line 81
    .line 82
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 83
    .line 84
    .line 85
    iget v0, p2, Lbe8;->k:I

    .line 86
    .line 87
    int-to-long v0, v0

    .line 88
    const/16 v2, 0xa

    .line 89
    .line 90
    invoke-interface {p1, v0, v1, v2}, Lab6;->f(JI)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p2, Lbe8;->l:Ld40;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const/4 v1, 0x0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    if-ne v0, v6, :cond_0

    .line 106
    .line 107
    move v0, v6

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-static {}, Lh;->c()V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_1
    move v0, v1

    .line 115
    :goto_0
    const/16 v2, 0xb

    .line 116
    .line 117
    int-to-long v3, v0

    .line 118
    invoke-interface {p1, v3, v4, v2}, Lab6;->f(JI)V

    .line 119
    .line 120
    .line 121
    const/16 v0, 0xc

    .line 122
    .line 123
    iget-wide v2, p2, Lbe8;->m:J

    .line 124
    .line 125
    invoke-interface {p1, v2, v3, v0}, Lab6;->f(JI)V

    .line 126
    .line 127
    .line 128
    const/16 v0, 0xd

    .line 129
    .line 130
    iget-wide v2, p2, Lbe8;->n:J

    .line 131
    .line 132
    invoke-interface {p1, v2, v3, v0}, Lab6;->f(JI)V

    .line 133
    .line 134
    .line 135
    const/16 v0, 0xe

    .line 136
    .line 137
    iget-wide v2, p2, Lbe8;->o:J

    .line 138
    .line 139
    invoke-interface {p1, v2, v3, v0}, Lab6;->f(JI)V

    .line 140
    .line 141
    .line 142
    const/16 v0, 0xf

    .line 143
    .line 144
    iget-wide v2, p2, Lbe8;->p:J

    .line 145
    .line 146
    invoke-interface {p1, v2, v3, v0}, Lab6;->f(JI)V

    .line 147
    .line 148
    .line 149
    iget-boolean v0, p2, Lbe8;->q:Z

    .line 150
    .line 151
    const/16 v2, 0x10

    .line 152
    .line 153
    int-to-long v3, v0

    .line 154
    invoke-interface {p1, v3, v4, v2}, Lab6;->f(JI)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p2, Lbe8;->r:Lg85;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    if-ne v0, v6, :cond_2

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    invoke-static {}, Lh;->c()V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_5

    .line 175
    .line 176
    :cond_3
    move v6, v1

    .line 177
    :goto_1
    const/16 v0, 0x11

    .line 178
    .line 179
    int-to-long v1, v6

    .line 180
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 181
    .line 182
    .line 183
    iget v0, p2, Lbe8;->s:I

    .line 184
    .line 185
    int-to-long v0, v0

    .line 186
    const/16 v2, 0x12

    .line 187
    .line 188
    invoke-interface {p1, v0, v1, v2}, Lab6;->f(JI)V

    .line 189
    .line 190
    .line 191
    iget v0, p2, Lbe8;->t:I

    .line 192
    .line 193
    int-to-long v0, v0

    .line 194
    const/16 v2, 0x13

    .line 195
    .line 196
    invoke-interface {p1, v0, v1, v2}, Lab6;->f(JI)V

    .line 197
    .line 198
    .line 199
    const/16 v0, 0x14

    .line 200
    .line 201
    iget-wide v1, p2, Lbe8;->u:J

    .line 202
    .line 203
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 204
    .line 205
    .line 206
    iget v0, p2, Lbe8;->v:I

    .line 207
    .line 208
    int-to-long v0, v0

    .line 209
    const/16 v2, 0x15

    .line 210
    .line 211
    invoke-interface {p1, v0, v1, v2}, Lab6;->f(JI)V

    .line 212
    .line 213
    .line 214
    iget v0, p2, Lbe8;->w:I

    .line 215
    .line 216
    int-to-long v0, v0

    .line 217
    const/16 v2, 0x16

    .line 218
    .line 219
    invoke-interface {p1, v0, v1, v2}, Lab6;->f(JI)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p2, Lbe8;->x:Ljava/lang/String;

    .line 223
    .line 224
    const/16 v1, 0x17

    .line 225
    .line 226
    if-nez v0, :cond_4

    .line 227
    .line 228
    invoke-interface {p1, v1}, Lab6;->m(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_4
    invoke-interface {p1, v1, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_2
    iget-object v0, p2, Lbe8;->y:Ljava/lang/Boolean;

    .line 236
    .line 237
    if-eqz v0, :cond_5

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    goto :goto_3

    .line 248
    :cond_5
    const/4 v0, 0x0

    .line 249
    :goto_3
    const/16 v1, 0x18

    .line 250
    .line 251
    if-nez v0, :cond_6

    .line 252
    .line 253
    invoke-interface {p1, v1}, Lab6;->m(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    int-to-long v2, v0

    .line 262
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 263
    .line 264
    .line 265
    :goto_4
    iget-object p2, p2, Lbe8;->j:Lj31;

    .line 266
    .line 267
    iget-object v0, p2, Lj31;->a:Lyy4;

    .line 268
    .line 269
    invoke-static {v0}, Li95;->y(Lyy4;)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    const/16 v1, 0x19

    .line 274
    .line 275
    int-to-long v2, v0

    .line 276
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 277
    .line 278
    .line 279
    iget-object v0, p2, Lj31;->b:Lny4;

    .line 280
    .line 281
    invoke-static {v0}, Li95;->n(Lny4;)[B

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    const/16 v1, 0x1a

    .line 286
    .line 287
    invoke-interface {p1, v1, v0}, Lab6;->h(I[B)V

    .line 288
    .line 289
    .line 290
    iget-boolean v0, p2, Lj31;->c:Z

    .line 291
    .line 292
    const/16 v1, 0x1b

    .line 293
    .line 294
    int-to-long v2, v0

    .line 295
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 296
    .line 297
    .line 298
    iget-boolean v0, p2, Lj31;->d:Z

    .line 299
    .line 300
    const/16 v1, 0x1c

    .line 301
    .line 302
    int-to-long v2, v0

    .line 303
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 304
    .line 305
    .line 306
    iget-boolean v0, p2, Lj31;->e:Z

    .line 307
    .line 308
    const/16 v1, 0x1d

    .line 309
    .line 310
    int-to-long v2, v0

    .line 311
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 312
    .line 313
    .line 314
    iget-boolean v0, p2, Lj31;->f:Z

    .line 315
    .line 316
    const/16 v1, 0x1e

    .line 317
    .line 318
    int-to-long v2, v0

    .line 319
    invoke-interface {p1, v2, v3, v1}, Lab6;->f(JI)V

    .line 320
    .line 321
    .line 322
    const/16 v0, 0x1f

    .line 323
    .line 324
    iget-wide v1, p2, Lj31;->g:J

    .line 325
    .line 326
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 327
    .line 328
    .line 329
    const/16 v0, 0x20

    .line 330
    .line 331
    iget-wide v1, p2, Lj31;->h:J

    .line 332
    .line 333
    invoke-interface {p1, v1, v2, v0}, Lab6;->f(JI)V

    .line 334
    .line 335
    .line 336
    iget-object p2, p2, Lj31;->i:Ljava/util/Set;

    .line 337
    .line 338
    invoke-static {p2}, Li95;->H(Ljava/util/Set;)[B

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    const/16 v0, 0x21

    .line 343
    .line 344
    invoke-interface {p1, v0, p2}, Lab6;->h(I[B)V

    .line 345
    .line 346
    .line 347
    const/16 p2, 0x22

    .line 348
    .line 349
    invoke-interface {p1, p2, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :goto_5
    return-void

    .line 353
    :pswitch_0
    check-cast p2, Lpz7;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object p0, p2, Lpz7;->a:Ljava/lang/String;

    .line 362
    .line 363
    invoke-interface {p1, v6, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, p2, Lpz7;->b:Ljava/lang/String;

    .line 367
    .line 368
    invoke-interface {p1, v5, v6}, Lab6;->F(ILjava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v5, p2, Lpz7;->c:Ljava/lang/String;

    .line 372
    .line 373
    invoke-interface {p1, v4, v5}, Lab6;->F(ILjava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v4, p2, Lpz7;->d:Ljava/lang/String;

    .line 377
    .line 378
    invoke-interface {p1, v3, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 379
    .line 380
    .line 381
    iget-wide v3, p2, Lpz7;->e:J

    .line 382
    .line 383
    invoke-interface {p1, v3, v4, v2}, Lab6;->f(JI)V

    .line 384
    .line 385
    .line 386
    invoke-interface {p1, v1, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {p1, v0, v6}, Lab6;->F(ILjava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :pswitch_1
    check-cast p2, Lyy7;

    .line 394
    .line 395
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object p0, p2, Lyy7;->a:Ljava/lang/String;

    .line 402
    .line 403
    invoke-interface {p1, v6, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 404
    .line 405
    .line 406
    iget-object v0, p2, Lyy7;->b:Ljava/lang/String;

    .line 407
    .line 408
    invoke-interface {p1, v5, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget-object v0, p2, Lyy7;->c:Ljava/lang/String;

    .line 412
    .line 413
    invoke-interface {p1, v4, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 414
    .line 415
    .line 416
    iget-object v0, p2, Lyy7;->d:Ljava/lang/String;

    .line 417
    .line 418
    invoke-interface {p1, v3, v0}, Lab6;->F(ILjava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iget-object p2, p2, Lyy7;->e:Ljava/lang/String;

    .line 422
    .line 423
    invoke-interface {p1, v2, p2}, Lab6;->F(ILjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-interface {p1, v1, p0}, Lab6;->F(ILjava/lang/String;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    nop

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final s()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lwy7;->F0:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "UPDATE `ussd_responses` SET `ussd_code` = ?,`field_name` = ?,`value` = ?,`raw_response` = ?,`timestamp` = ? WHERE `ussd_code` = ? AND `field_name` = ?"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "UPDATE `ussd_codes` SET `id` = ?,`name` = ?,`code` = ?,`category` = ?,`description` = ? WHERE `id` = ?"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
