.class public final synthetic Le83;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lji8;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lji8;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le83;->a:Lji8;

    .line 5
    .line 6
    iput p2, p0, Le83;->b:I

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Le83;->a:Lji8;

    .line 2
    .line 3
    iget-object v0, v0, Lji8;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "next_job_scheduler_id"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Len5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    long-to-int v1, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v3

    .line 27
    :goto_0
    const v4, 0x7fffffff

    .line 28
    .line 29
    .line 30
    if-ne v1, v4, :cond_1

    .line 31
    .line 32
    move v4, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    add-int/lit8 v4, v1, 0x1

    .line 35
    .line 36
    :goto_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    new-instance v6, Ldn5;

    .line 41
    .line 42
    int-to-long v7, v4

    .line 43
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-direct {v6, v2, v4}, Ldn5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v5, Len5;->a:La96;

    .line 51
    .line 52
    new-instance v7, Lw34;

    .line 53
    .line 54
    const/16 v8, 0x12

    .line 55
    .line 56
    invoke-direct {v7, v8, v5, v6}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    invoke-static {v4, v3, v5, v7}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-ltz v1, :cond_2

    .line 64
    .line 65
    iget p0, p0, Le83;->b:I

    .line 66
    .line 67
    if-gt v1, p0, :cond_2

    .line 68
    .line 69
    move v3, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v0, Ldn5;

    .line 76
    .line 77
    const-wide/16 v6, 0x1

    .line 78
    .line 79
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v0, v2, v1}, Ldn5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Len5;->a:La96;

    .line 87
    .line 88
    new-instance v2, Lw34;

    .line 89
    .line 90
    invoke-direct {v2, v8, p0, v0}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v3, v5, v2}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
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
