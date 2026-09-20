.class public final Leh3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:La96;

.field public final b:Ldo7;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/concurrent/locks/ReentrantLock;

.field public final e:Lq83;

.field public final f:Lq83;

.field public final g:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(La96;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leh3;->a:La96;

    .line 5
    .line 6
    new-instance v9, Ldo7;

    .line 7
    .line 8
    iget-boolean v10, p1, La96;->k:Z

    .line 9
    .line 10
    new-instance v0, Lo0;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x14

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-class v3, Leh3;

    .line 17
    .line 18
    const-string v4, "notifyInvalidatedObservers"

    .line 19
    .line 20
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v2, p0

    .line 24
    invoke-direct/range {v0 .. v8}, Lo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v3, p3

    .line 30
    move-object v4, p4

    .line 31
    move-object v6, v0

    .line 32
    move-object v0, v9

    .line 33
    move v5, v10

    .line 34
    invoke-direct/range {v0 .. v6}, Ldo7;-><init>(La96;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLo0;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Leh3;->b:Ldo7;

    .line 38
    .line 39
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Leh3;->c:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    new-instance v1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Leh3;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 52
    .line 53
    new-instance v1, Lq83;

    .line 54
    .line 55
    const/4 v2, 0x6

    .line 56
    invoke-direct {v1, p0, v2}, Lq83;-><init>(Leh3;I)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Leh3;->e:Lq83;

    .line 60
    .line 61
    new-instance v1, Lq83;

    .line 62
    .line 63
    const/4 v2, 0x7

    .line 64
    invoke-direct {v1, p0, v2}, Lq83;-><init>(Leh3;I)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Leh3;->f:Lq83;

    .line 68
    .line 69
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Leh3;->g:Ljava/lang/Object;

    .line 87
    .line 88
    new-instance v1, Lzh;

    .line 89
    .line 90
    const/16 v2, 0x17

    .line 91
    .line 92
    invoke-direct {v1, v2, p0}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Ldo7;->k:Lsr2;

    .line 96
    .line 97
    return-void
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
